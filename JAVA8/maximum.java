// Given a list of integers, find the maximum value element present in it using Stream functions?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class maximum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n=sc.nextInt();
        List<Integer> lst=new ArrayList<>();
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            lst.add(sc.nextInt());
        }
        int max=lst.stream().max(Integer::compare).get();
        System.out.println("Maximum number is : "+max);
        int min=lst.stream().min(Integer::compare).get();
        System.out.println("Minimum number : "+min);
    }
}