import java.util.*;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);
        map.put("Pomegranate",4);
        

        //entrySet() returns a set of Map.Entry objects, where each entry = key + value pair
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        
        System.out.println("Elements from entrySet : "+entrySet);
    }
}
