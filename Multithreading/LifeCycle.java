public class LifeCycle {
    public static  final Object lock=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadDemo());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            t1.join();
            System.out.println(t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo implements Runnable{

    @Override
    public void run() {
       synchronized (LifeCycle.lock) {
            System.out.println("Thread is in Synchronized block");
            LifeCycle.lock.notify();
            try {
                System.out.println("In waiting State");
                LifeCycle.lock.wait(1000);
                System.out.println("After waiting state");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }
    }
    
}