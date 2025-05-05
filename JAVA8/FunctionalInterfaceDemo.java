/*
"Problem Statement:
Write a functional interface named CustomMathOperation that performs a mathematical 
operation on two integers and returns an integer result. Use this functional interface in a program to:

Add two numbers.
Multiply two numbers.
Find the greater of two numbers.
Requirements:

Define the functional interface.
Use lambda expressions to implement the methods for the given operations.
Sample Input:

plaintext
Copy code
Input1: 12
Input2: 8
Sample Output:

plaintext
Copy code
Addition: 20
Multiplication: 96
Greater Number: 12
Hint:
A functional interface should have exactly one abstract method. Use @FunctionalInterface annotation for clarity."
 */

interface CustomMathOperation{
    public int calculate(int a,int b);
}
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        int num1=12;
        int num2=8;

        CustomMathOperation add=(a,b)->a+b;
        CustomMathOperation mul=(a,b)->a*b;
        CustomMathOperation grtr=(a,b)->a>b?a:b;

        System.out.println("Addition : "+add.calculate(num1, num2));
        System.out.println("Multiplication : "+mul.calculate(num1, num2));
        System.out.println("Greater : "+grtr.calculate(num1, num2));
    }
}