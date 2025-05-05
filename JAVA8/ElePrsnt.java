//  Given a list of integers, find the total number of elements present in the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class ElePrsnt {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,5,6,78,8);
        long result=list.stream().count();
        System.out.println("Original List : "+list);
        System.out.println("Total Element present : "+result);
    }
}
