import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Coding Exercise: Sum of Squares
You have to implement a function named sumOfSquares in the class FunctionalProgrammingMagic which takes a list of integers as input and returns the sum of squares of these integers.

Please consider the following edge conditions:

If the input list is null, your function should return 0.



Examples

Let's consider the following examples:

Example 1:

Input:

List<Integer> numbers = List.of(1, 2, 3);
Output:

long sum = sumOfSquares(numbers);
System.out.println(sum); // Prints: 14
Example 2:

Input:

List<Integer> numbers = null;
Output:

long sum = sumOfSquares(numbers);
System.out.println(sum); // Prints: 0
Example 3:

Input:

List<Integer> numbers = List.of();
Output:

long sum = sumOfSquares(numbers);
System.out.println(sum); // Prints: 0


Notes

The stream() method is used to create a stream of elements from a collection.

The mapToLong() method is a special version of the map() method. It produces an LongStream (a stream of long values) and takes a function that transforms an object into an int.

The sum() method calculates the sum of numbers in the stream.



These are very powerful methods in Java's Stream API, allowing us to perform complex data processing queries on collections of objects. The use of these methods can greatly simplify your code. */

public class SquareSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int x=sc.nextInt();
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<x;i++){
            System.out.println("Enter "+(i+1)+" element : ");
            lst.add(sc.nextInt());
        }
        System.out.println("Original list : "+lst);
        System.out.println(sumOfSquares(lst));
    }
    public static long sumOfSquares(List<Integer> lst){
        if(lst==null){
            return 0;
        }
        return lst.stream().mapToLong(n->(long)n*n).reduce(0L,(a,b)->a+b);
    }
}
