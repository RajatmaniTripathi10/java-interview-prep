/*Coding Exercise: Get Cubes of First N Numbers
You have been given a partially completed Java program FunctionalProgrammingMagic which contains an incomplete method getCubesOfFirstNNumbers().

This method takes an integer n as input and returns a list of cubes of the first n natural numbers.

Edge Conditions

Assume that n is always greater than or equal to zero.

Also, if n is zero, your code should return an empty list.

Input Format

The input to the method is a single integer n which represents the count of natural numbers for which the cubes need to be calculated.

Output Format

The method should return a List<Integer> which contains the cubes of first n natural numbers.

Instructions

Use IntStream.range() to generate a sequence of integers from 1 to n (inclusive).

Apply the map() function to each number in the stream. This function should calculate the cube of each number.

Since the map() function produces an IntStream, you need to convert it to a Stream<Integer>. This is required because the collect() function used in the next step needs a Stream<T> not an IntStream. Use the boxed() function for this conversion.

Finally, use the collect() function with Collectors.toList() to collect the cubed numbers into a List<Integer> and return it.

Examples

Input: n = 5 Return Value: [1, 8, 27, 64, 125]

Example 2

Input: n = 3 Return Value: [1, 8, 27]

Example 3

Input: n = 0 Return Value: [] */

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its cube");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("List of cubes of  first "+n+" numbers : "+findCubes(n));
    }
    public static List<Integer> findCubes(int n){
        return IntStream.rangeClosed(1,n).map(i->i*i*i).boxed().collect(Collectors.toList());
    }
    
}
