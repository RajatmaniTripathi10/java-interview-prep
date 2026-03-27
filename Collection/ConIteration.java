import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class ConIteration {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);
        
        //This will not throw ConcurrentModificationException because ConcurrentHashMap allows concurrent modification while iterating over it
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            map.put("Pomegranate",4);
        }
        System.out.println(map);
    }
}
