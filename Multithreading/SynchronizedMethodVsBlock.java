public class SynchronizedMethodVsBlock{
    
    public static int num=1;
    public static void main(String[] args){
        SynchronizedMethodVsBlock eo=new SynchronizedMethodVsBlock();
        Thread t1=new Thread(()->eo.Even());
        Thread t2=new Thread(()->eo.Odd());
        t1.start();
        t2.start();
    }
    public void Even(){
        while(num<=10){
            synchronized(this){
                if(num%2==0){
                    System.out.println("Even : "+num);
                    num++;
                    notifyAll();
                }else{
                    try{
                        wait();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public synchronized void Odd(){
        while(num<=10){
            if(num%2!=0){
                System.out.println("Odd :"+num);
                num++;
                notifyAll();
            }else{
                try{
                    wait();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

