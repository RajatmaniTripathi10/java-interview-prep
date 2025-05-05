// Use streams to count the occurrences of each element in a list.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        List<String> lst=Arrays.asList("Apple","Banana","Apple","Orange","Orange","Pomegranate");
        Map<String,Long> map=lst.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        map.forEach((key,value)->System.out.println(key+" : "+value));
    }
    

}
