import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Descending {
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(23,32,43,34,38,20,32);
       List<Integer> result=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
       System.out.println("Descending order : "+result);
    }
    
}