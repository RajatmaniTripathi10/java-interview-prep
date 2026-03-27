import java.util.*;
public class SyncIteration{
    public static void main(String[] args){
        Map<String,Integer> map=Collections.synchronizedMap(new HashMap<>());
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);
        
        //This will throw ConcurrentModificationException because we are modifying the map while iterating over it
        // for(Map.Entry<String,Integer> entry:map.entrySet()){
        //     map.put("Pomegranate",4);
        // }
        //To avoid this exception, we need to synchronize the map while iterating over it
        synchronized(map){
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
                
            }
        }
        map.put("Pomegranate",4);
        System.out.println(map);
    }
}