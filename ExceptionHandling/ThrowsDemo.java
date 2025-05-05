import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowsDemo {
   public static void divide(int a,int b) throws ArithmeticException {
    if(b==0){
        System.out.println("Can not divided by zero");
    }else{
        System.out.println("Result : "+a/b);
    }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    int b=sc.nextInt();
    try{
        divide(a, b);
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
   }
}
