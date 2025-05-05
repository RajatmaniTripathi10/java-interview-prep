// Write a Java program to solve the producer-consumer problem using wait() and notify().

import java.util.LinkedList;

class ProducerConsumer{
    private final LinkedList<Integer> buffer=new LinkedList<>();
    private final int MAX_CAPACITY=5;
    private final int maxIterations = 10;

    class Producer implements Runnable{
        @Override
        public void run(){
            int value=0;
            for (int i = 0; i < maxIterations; i++){
                synchronized(buffer){
                    while(buffer.size()==MAX_CAPACITY){
                        try{
                            System.out.println("Buffer is full. Producer is waiting.");
                            buffer.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Producer produce :"+value);
                    buffer.add(value++);
                    buffer.notify();
                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run(){
            for (int i = 0; i < maxIterations; i++){
                synchronized(buffer){
                    while(buffer.isEmpty()){
                        try{
                            System.out.println("Buffer is empty. Consumer is waiting.");
                            buffer.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    int value=buffer.removeFirst();
                    System.out.println("Consumer consumes value :"+value);
                    buffer.notify();
                }
            }
        }
    }
    public void startThreads() {
        Thread producerThread = new Thread(new Producer()); // Create producer thread.
        Thread consumerThread = new Thread(new Consumer()); // Create consumer thread.
        producerThread.start(); // Start producer thread.
        consumerThread.start(); // Start consumer thread.
    }
    public static void main(String[] args) {
        ProducerConsumer pc=new ProducerConsumer();
        pc.startThreads();

    }
}

