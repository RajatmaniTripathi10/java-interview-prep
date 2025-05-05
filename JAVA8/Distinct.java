import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(12,2,3,23,12,67,12,3,2);
        List<Integer> result=lst.stream().distinct().collect(Collectors.toList());
        System.out.println("Original List : "+lst);
        System.out.println("Distinct List : "+result);
    }
}
