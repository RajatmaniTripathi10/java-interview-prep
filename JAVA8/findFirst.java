// Given the list of integers, find the first element of the list using Stream functions?

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findFirst {
    public static void main(String[] args) {
        List<Integer> lst=Arrays.asList(12,11,23,9,5,7,3);
        Integer result=lst.stream().collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                            .filter(s->s.getValue()==1)
                            .map(s->s.getKey())
                            .findFirst().orElse(null);
        System.out.println(result);
         String s = "aabbcde";
        Character character=s.chars()
                                .mapToObj(c->(char)c)
                                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                                .entrySet().stream()
                                .filter(c->c.getValue()==1)
                                .map(c->c.getKey())
                                .findFirst().orElse(null);
                System.out.println(character);
    }
    }
