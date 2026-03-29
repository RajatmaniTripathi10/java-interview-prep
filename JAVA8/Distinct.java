
import java.util.*;
import java.util.stream.*;
class Distinct {
    public static void main(String[] args) {
         List<Integer> lst=Arrays.asList(12,2,3,23,12,67,12,3,2);
         System.out.println("Original : "+lst);
         Set<Integer> set = new HashSet<>();
         Set<Integer> distinct=lst.stream().filter(s->set.add(s)).collect(Collectors.toSet());
         System.out.println("Distinct element : "+distinct);

            //Another way to find distinct elements in a list is to use the distinct() method of the Stream interface. This method returns a stream consisting of the distinct elements of the stream.
            Set<Integer> distinct1=lst.stream().distinct().collect(Collectors.toSet());
            System.out.println("Distinct element : "+distinct1);
    
    }
}