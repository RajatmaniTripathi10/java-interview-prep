import java.util.Scanner;

public class ThrowDemo {
    public static void age(int age){
        if(age<18){
            throw new IllegalArgumentException("Invalid age for casting vote");
        }else{
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        try{
            age(age);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
