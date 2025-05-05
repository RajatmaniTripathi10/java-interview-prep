public class EvenOdd{
    public static final Object lock=new Object();
    public static int count=0;
    public static void main(String[] args) {
        Runnable evenTask=()->{
            while (count<=100) {
                synchronized(lock){
                    if(count%2==0){
                        System.out.println("Even : "+count);
                        count++;
                        lock.notify();
                    }else{
                        try{
                            lock.wait(1000);
                        }catch(InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        Runnable oddTask=()->{
            while (count<=100) {
                synchronized(lock){
                    if(count%2~=0){
                        System.out.println("Odd : "+count);
                        count++;
                        lock.notify();
                    }else{
                        try{
                            lock.wait(1000);
                        }catch(InterruptedException e){
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };
        Thread t1=new Thread(evenTask);
        Thread t2=new Thread(oddTask);
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
