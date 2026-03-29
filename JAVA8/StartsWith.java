import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<String> lst=List.of("Apple","Mango","Orange","Abhishek","Onion");

        //Find the first string that starts with "A" in the list using Stream functions.
        String str=lst.stream().filter(s->s.startsWith("A")).findFirst().orElse(null);
        System.out.println(str);
        
        //Find the all strings that starts with "O" in the list using Stream functions.
        List<String> lst1=lst.stream().filter(s->s.startsWith("O")).collect(Collectors.toList());
        System.out.println(lst1);
    }
}
