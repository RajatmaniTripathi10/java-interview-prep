//  Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartWith1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of elements: ");
       int x = sc.nextInt();
       List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            lst.add(sc.nextInt());
        }
        sc.nextLine();
       System.out.println("Original List : "+lst);
       System.out.println("Enter number starsWith : ");
       String str=sc.nextLine();
       List<String> resuList=lst.stream().map(s->s+"").filter(s->s.startsWith(str)).collect(Collectors.toList());
       System.out.println("List of elements start with "+str+" : "+resuList);
    }   
}
