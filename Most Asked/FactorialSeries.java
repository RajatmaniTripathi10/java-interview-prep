import java.util.Scanner;

public class FactorialSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int lower=sc.nextInt();
        System.out.print("Enter upper limit : ");
        int upper=sc.nextInt();
        if(lower<0 || lower>upper){
            System.out.println("Enter valid limits");
            return;
        }
        System.out.println("Factorial series between "+lower+" and "+upper);
        for(int i=lower;i<=upper;i++){
            System.out.println(i+"! :"+factSeries(i));
        }
    }
    public static long factSeries(int num){
        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    
}
