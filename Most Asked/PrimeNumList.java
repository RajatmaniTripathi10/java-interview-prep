import java.util.Scanner;

public class PrimeNumList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int lower=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter upper Limit : ");
        int upper=sc.nextInt();
        if(lower<=1 || lower>upper){
            System.out.println("Please enter a valid limit");
            return;
        }
        System.out.println("Prime number between "+lower+" and "+upper+" : ");
        for(int i=lower;i<=upper;i++){
            if(primeList(i)){
                System.out.println(i+"");
            }
        }
    }
    public static boolean primeList(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
