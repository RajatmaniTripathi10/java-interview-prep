import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
    public static void main(String[] args) {
       List<String> strings=Arrays.asList("Apple","Date","Banana","Orange");
       System.out.println(strings);

       List<Integer> length=strings.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println("Length of each string : "+length);
         
        List<String> sorted=strings.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
        System.out.println("Strings sorted by length : "+sorted);

        List<String> sortedDescending=strings.stream().sorted((s1,s2)->s2.length()-s1.length()).collect(Collectors.toList());
        System.out.println("Strings sorted by length (descending) : "+sortedDescending);
    }
    
}
