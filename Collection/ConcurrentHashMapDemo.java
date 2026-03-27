import java.util.concurrent.*;
public class ConcurrentHashMapDemo{
    public static void main(String[] args){
        ConcurrentHashMap<String,Integer> cunMap=new ConcurrentHashMap<>();
        
        Thread t1=new Thread(()->{
            for(int i=0;i<=10000;i++){
                cunMap.put("A"+i,i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=100;i<=1000;i++){
                cunMap.put("B"+i,i);
            }
        });
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("ConcurrentHashMap size : " + cunMap.size());
    }
}