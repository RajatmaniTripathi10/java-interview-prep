// How to find duplicate elements in a given integers list in java using Stream functions?

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate{
    public static void main(String[] args) {
       List<Integer> lst=List.of(12,15,29,11,35,29,11,90);
       Set<Integer> set=new HashSet<>();
       List<Integer>  result=lst.stream().filter(n->!set.add(n)).collect(Collectors.toList());
       System.out.println("Original List  : "+lst);
       System.out.println("Duplicate Elements : "+result);
    }
}
