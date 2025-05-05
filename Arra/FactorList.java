import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  FactorList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.println(factor(num));
    }
    public static List<Integer> factor(int num){
        List<Integer> lst=new ArrayList<>();
        if(num<=0){
            return lst;
        }
        for(int i=1;i<=num;i++){
            if(num%i==0){
                lst.add(i);
            }
        }
        return lst;
    }
}
