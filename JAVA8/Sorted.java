// Given a list of integers, sort all the values present in it using Stream functions?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(23,88,1,45,72,66,54);
        List<Integer> result=lst.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
