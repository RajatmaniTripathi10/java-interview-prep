import java.util.*;
public class HashMapDemo{
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> syncMap=Collections.synchronizedMap(map);
        
        syncMap.put("Apple",1);
        syncMap.put("Banana",2);
        syncMap.put("Orange",3);
        syncMap.put("Pomegranate",4);
        
        System.out.println("Elements from synchronizedMap : "+syncMap);
        
        
    }
}