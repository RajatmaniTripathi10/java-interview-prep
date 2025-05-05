// Find the max and min elements in a list using streams.

import java.awt.SystemColor;
import java.lang.classfile.ClassFile;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinUsingStreams {
    public static void main(String[] args) {
       List<Integer> lst=Arrays.asList(2,6,3,6,7,2,5,8);
       System.out.println("Original List : "+lst);
       Optional<Integer> min=lst.stream().min(Integer::compareTo);
       Optional<Integer> max=lst.stream().max(Integer::compareTo);
       min.ifPresent(minValue->System.out.println("Min value : "+minValue));
       max.ifPresent(maxValue->System.out.println("Max value : "+maxValue));
       Optional<Integer> max1=lst.stream().reduce((a,b)->a>b?a:b);
       Optional<Integer> min1=lst.stream().reduce((a,b)->a<b?a:b);
       max1.ifPresent(maxValue1->System.out.println("Max by reduce method : "+maxValue1));
       min1.ifPresent(minvalue1->System.out.println("Min by reduce method : "+minvalue1));
    }
}
