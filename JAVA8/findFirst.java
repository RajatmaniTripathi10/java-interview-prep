// Given the list of integers, find the first element of the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class findFirst {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(12,11,23,9,5,7,3);
        lst.stream().findFirst().ifPresent(System.out::println);
    }
}
