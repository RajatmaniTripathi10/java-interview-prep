public class EvenOdd {

    public static final Object lock=new Object();
    public static int count=1;
    public static void main(String[] args) {
        Thread t1=new Thread(new Even());
        Thread t2=new Thread(new Odd());
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
}

}

class Even implements Runnable{
    public void run(){
        while(EvenOdd.count<=10){
            synchronized(EvenOdd.lock){
                if(EvenOdd.count%2==0){
                    System.out.println("Even:"+EvenOdd.count);
                    EvenOdd.count++;
                    EvenOdd.lock.notifyAll();
                }else{
                    try{EvenOdd.lock.wait();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Odd implements Runnable{
    public void run(){
        while(EvenOdd.count<=10){
            synchronized(EvenOdd.lock){
                if(EvenOdd.count%2!=0){
                    System.out.println("Odd:"+EvenOdd.count);
                    EvenOdd.count++;
                    EvenOdd.lock.notifyAll();
                }else{
                    try{EvenOdd.lock.wait();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}