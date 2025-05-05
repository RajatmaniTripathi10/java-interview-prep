import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(12,34,11,45,21,34,114,4,23);
        List<Integer> even=lst.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> odd=lst.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Original List : "+lst);
        System.out.println("Even : "+even);
        System.out.println("Odd : "+odd);
    }
}