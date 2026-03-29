import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class NonRepeat {
    public static void main(String[] args) {
        String s = "aabbcde";
        //Find the first non-repeating character in the string using Stream functions.
        Character ch=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
            .entrySet().stream()
            .filter(c->c.getValue()==1)
            .map(c->c.getKey())
            .findFirst().orElse(null);
                    
            System.out.println("First non-repeating character : "+ch);
        
        //Find all non-repeating characters in the string using Stream functions.
        List<Character> ch1=s.chars().mapToObj(c->(char)c)
                            .collect(Collectors.groupingBy(c->c,
                            LinkedHashMap::new,Collectors.counting()))
                            .entrySet().stream()
                            .filter(c->c.getValue()==1)
                            .map(c->c.getKey())
                            .collect(Collectors.toList());
                    System.out.println("All non-repeating characters : "+ch1);
    }
}
