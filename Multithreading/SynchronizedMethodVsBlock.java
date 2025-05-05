public class SynchronizedMethodVsBlock {
    public static void main(String[] args) {
        synchronizedDemo obj=new synchronizedDemo();
        Thread t1=new Thread(()->{
            for(int i=0;i<=5;i++){
                obj.syncMetod();
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<=5;i++){
                obj.nonSyncMethod();
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

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

class synchronizedDemo{
    int count=0;
    public synchronized void syncMetod(){
        count++;
        System.out.println("Increament using method : "+count);
    }
    public void nonSyncMethod(){
        synchronized(this){
            count++;
            System.out.println("increment using block : "+count);
        }
    }
}