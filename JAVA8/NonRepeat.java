import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class NonRepeat {
    public static void main(String[] args) {
        String s = "aabbcde";
        List<Character> lst=s.chars()
                                .mapToObj(c->(char)c)
                                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                                .entrySet().stream()
                                .filter(c->c.getValue()==1)
                                .map(c->c.getKey())
                                .collect(Collectors.toList());
                System.out.println(lst);
    }
}
