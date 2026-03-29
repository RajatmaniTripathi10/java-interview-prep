import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Unique {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4);
        List<Integer> lst=list.stream()
                            .collect(Collectors.groupingBy(
                                n->n,
                                LinkedHashMap::new , Collectors.counting()
                                ))
                                .entrySet()
                                .stream().filter(n->n.getValue()==1)
                                .map(n->n.getKey())
                                .collect(Collectors.toList());
                System.out.println(lst);
    }
}
