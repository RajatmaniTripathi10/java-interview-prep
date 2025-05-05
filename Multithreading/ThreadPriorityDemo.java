
public class ThreadPriorityDemo  {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadPriority("Thread 1"));
        Thread t2=new Thread(new ThreadPriority("Thread 2"));
        Thread t3=new Thread(new ThreadPriority("Thread 3"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadPriority implements  Runnable{
    String threadName;

    public ThreadPriority(String threadName) {
        this.threadName=threadName;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName +" Count : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName+" has finished");
    }
    
}
    



