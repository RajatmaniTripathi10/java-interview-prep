import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceString {
     public static void main(String[] args) {
        String s="RajatManiTripathi";
        System.out.println("String: "+s);

        //Outpur is in random order because of the nature of HashMap, if you want to maintain the order of characters as they appear in the string, you can use LinkedHashMap instead of HashMap in the groupingBy collector.
        Map<Character,Long> map=s.chars().mapToObj(c->(char)c)
                             .collect(Collectors.groupingBy(c->c,Collectors.counting()));
                    map.forEach((key,value)->System.out.println(key+" : "+value));
        //Now if you want to maintain the order of characters as they appear in the string, you can use LinkedHashMap instead of HashMap in the groupingBy collector.

        System.out.println("=================================================================================");
        System.out.println("Using LinkedHashMap to maintain the order of characters as they appear in the string:");
        Map<Character,Long> map1=s.chars().mapToObj(c->(char)c)
                             .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
                    map1.forEach((key,value)->System.out.println(key+" : "+value));
     }
}
