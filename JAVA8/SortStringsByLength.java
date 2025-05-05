import java.util.Arrays;
import java.util.List;

public class SortStringsByLength {
    public static void main(String[] args) {
       List<String> strings=Arrays.asList("Apple","Date","Banana","Orange");

      //  List<String> sortedStrings=strings.stream()
      //  .sorted((s1,s2)->Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
   String LongestString=strings.stream() .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
    .orElse("");
       

      //  System.out.println(sortedStrings);
      System.out.println(LongestString);
    }
    
}
