//Write a Java program to solve the producer-consumer problem using wait() and notify().

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int value) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full. Producer is waiting...");
                wait(); // Wait until there is space in the buffer
            }
            buffer.add(value);
            System.out.println("Produced: " + value);
            notify(); // Notify a waiting consumer
        }
    }

    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty. Consumer is waiting...");
                wait(); // Wait until there is data to consume
            }
            int value = buffer.poll();
            System.out.println("Consumed: " + value);
            notify(); // Notify a waiting producer
            return value;
        }
    }
}

class Producer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sharedBuffer.produce(i);
                Thread.sleep(100); // Simulate time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sharedBuffer.consume();
                Thread.sleep(150); // Simulate time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5); // Buffer capacity of 5

        Thread producerThread = new Thread(new Producer(sharedBuffer));
        Thread consumerThread = new Thread(new Consumer(sharedBuffer));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Production and consumption completed.");
    }
}