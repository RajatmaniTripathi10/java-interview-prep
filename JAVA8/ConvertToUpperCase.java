// Convert a list of strings to uppercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
       List<String> lst=Arrays.asList("apple","banana","orange","pomegranate","silk","rajat");
       List<String> result=lst.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Original List : "+lst);
        System.out.println("Result : "+result);
        List<String> result1=lst.stream()
                            .map(s->s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
                            .collect(Collectors.toList());
        System.out.println("Start with Uppercase : "+result1);
    }
    
}
