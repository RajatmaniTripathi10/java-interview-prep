// How to find duplicate elements in a given integers list in java using Stream functions?

// How to find duplicate elements in a given integers list in java using Stream functions?

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate{
    public static void main(String[] args) {
       List<Integer> lst=List.of(12,15,29,11,35,29,11,90);
        System.out.println(lst);

        Set<Integer> seen = new HashSet<>();
        
        Set<Integer> set=lst.stream().filter(s->!seen.add(s))
                        .collect(Collectors.toSet());
            System.out.println(set);
    }
}

