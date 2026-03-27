import java.util.*;
public class SyncVSUnSyncMap{
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> syncMap=Collections.synchronizedMap(new HashMap<>());
        
        Thread t1=new Thread(()->{
            for(int i=0;i<=1000;i++){
                map.put("A"+i,i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1000;i<=10000;i++){
                map.put("B"+i,i);
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
        // System.out.println("UnSynchronized map : "+map);
        System.out.println("UnSynchronized map size : "+map.size());
        
        Thread t3=new Thread(()->{
           for(int i=0;i<=1000;i++){
                syncMap.put("C"+i,i);
            }
        });
        Thread t4=new Thread(()->{
            for(int i=1000;i<=10000;i++){
                syncMap.put("D"+i,i);
            }
        });
        
        t3.start();
        t4.start();
        
        try{
            t3.join();
            t4.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Synchronized map size : "+syncMap.size());
        
    }
}