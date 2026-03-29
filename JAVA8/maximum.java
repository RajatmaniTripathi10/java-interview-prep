import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class maximum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elemets : ");
        int s=sc.nextInt();
        List<Integer> lst=new ArrayList<>();
        System.out.println("Enter "+s+" elements");
        for(int i=0;i<s;i++){
            lst.add(sc.nextInt());
        }
        System.out.println("List : "+lst);
        int max=lst.stream().max(Integer::compare).get();
        int max1=lst.stream()
                    .reduce(Integer::max)
                    .orElse(Integer.MIN_VALUE);
        System.out.println("Max number : "+max);
        System.out.println("Max number using reduce method : "+max1);

        int min=lst.stream().reduce(Integer::min).orElse(Integer.MAX_VALUE);
        System.out.println("Min number using reduce method : "+min);
    }
}