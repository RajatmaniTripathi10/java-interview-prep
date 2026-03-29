
import java.util.*;
import java.util.stream.Collectors;
public class OccurrenceWord {
    public static void main(String[] args) {
        String s="I am Rajat Mani Tripathi and I am a software developer and I am learning Java 8 features.";
        
        Map<String,Long> map=Arrays.stream(s.split("\\s+"))
                                .collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));
                            map.forEach((key,value)->System.out.println(key+" : "+value));
    }
}
