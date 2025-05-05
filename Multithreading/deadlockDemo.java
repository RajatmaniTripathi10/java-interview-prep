

public class deadlockDemo {
    public static final Object lock1=new Object();
    public static final Object lock2=new Object();
    public static void main(String[] args) {
        Thread first=new Thread(new First());
        Thread second=new Thread(new Second());
        first.start();
        second.start();
        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
class First implements Runnable{

    @Override
    public void run() {
        synchronized (deadlockDemo.lock1) {
            System.out.println("Thread 1 acquire lock1 waiting for lock 2...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (deadlockDemo.lock2) {
                System.out.println("Thread 1 acquire lock2");
                
            }
        }
    }
    
}
class Second implements Runnable{
    @Override
    public void run() {
        synchronized (deadlockDemo.lock2) {
            System.out.println("Thread 2 acquire lock 2 waiting for lock1....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (deadlockDemo.lock1) {
                System.out.println("Thread 2 acquire lock1..");
                
            }
        }
    }
}