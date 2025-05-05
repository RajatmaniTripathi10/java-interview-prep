import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }
    }   
    public static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        return IntStream().rangeClosed(2,(int) Math.sqrt(num)).noneMatch(i->num%i==0);
    }
}

