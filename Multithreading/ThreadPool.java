

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executor.submit(new Task(i));
        }
        executor.shutdown();
    }
    
}

class Task implements Runnable{
    private int taskId;
    Task(int taskId){
        this.taskId=taskId;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task "+taskId+" is completed");
    }
    
}