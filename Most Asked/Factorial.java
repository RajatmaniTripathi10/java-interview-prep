import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.println(num+"! : "+fact(num));
   }
   public static long fact(int n){
    if(n<=0){
        return 0;
    }
    long fact=1;
    for(int i=1;i<=n;i++){
        fact*=i;
    }
    return fact;
   }
}
