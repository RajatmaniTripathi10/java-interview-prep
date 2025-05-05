import java.util.Scanner;

public class FibonacciSeries  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the Fibonacci Series");
        int n=sc.nextInt();
        fibnaci(n);
       }
       public static void fibnaci(int n){
           System.out.println("Series : "+"");
           int first=0,second=1;
           for(int i=0;i<=n;i++){
               System.out.println(first+"");
               int next=first+second;
               first=second;
               second=next;
           }
       }
}
