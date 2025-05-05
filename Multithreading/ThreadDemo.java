// Write a program to demonstrate creating threads using the Runnable interface and the Thread class.

class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Count from Runnable : "+i);
        }try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Count from Thread Class : "+i);
        }try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        // Create a new thread using the Runnable interface
        MyRunnable runnable=new MyRunnable();
        Thread t1=new Thread(runnable);
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        }
}
