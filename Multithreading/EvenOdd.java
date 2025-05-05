public class EvenOdd {
    public static final Object lock=new Object();
    public static int count=1;
    public static void main(String[] args) {
        Thread even=new Thread(new Even());
        Thread odd=new Thread(new Odd());
        even.start();
        odd.start();
        try {
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Even implements Runnable{

    @Override
    public void run() {
        while (EvenOdd.count<=10) {
            synchronized (EvenOdd.lock) {
                if(EvenOdd.count%2==0){
                    System.out.println("Even : "+EvenOdd.count);
                    EvenOdd.count++;
                    EvenOdd.lock.notify();
                }else{
                    try{
                        EvenOdd.lock.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
}

class Odd implements Runnable{

    @Override
    public void run() {
        while (EvenOdd.count<=10) {
            synchronized (EvenOdd.lock) {
                if(EvenOdd.count%2!=0){
                    System.out.println("ODD : "+EvenOdd.count);
                    EvenOdd.count++;
                    EvenOdd.lock.notify();
                }else{
                    try{
                        EvenOdd.lock.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
}