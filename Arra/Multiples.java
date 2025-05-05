/*
 You are given a partially completed NumberMagic class.

The class contains a method, determineMultiples(int number, int limit), which is supposed to return a list of multiples of a given number less than a specified limit.

Your task is to complete the implementation of this method.

The method signature is:

public List<Integer> determineMultiples(int number, int limit)
Input

The method takes two integer arguments:

number : The number to find multiples of.

limit : The upper bound for the multiples.

Output

The method should return a List<Integer> which contains all multiples of the given number that are less than the limit.

If number or limit is less than or equal to 0, the method should return an empty list.



Examples

Example 1

Pass number as 3 and limit as 20. Returned list should be [3, 6, 9, 12, 15, 18].

Example 2

Pass number as 5 and limit as 1. Method should return an empty list: [].
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();
        System.out.println("Enter limit : ");
        int limit=sc.nextInt();
        System.out.println(multiples(num, limit));
    }
    public static List<Integer> multiples(int num,int limit){
        List<Integer> lst=new ArrayList<>();
        if(num<=0 || limit<=num){
            return lst;
        }
        for(int i=num;i<=limit;i++){
            if(i%num==0){
                lst.add(i);
            }
        }
        return lst;
    }
}
