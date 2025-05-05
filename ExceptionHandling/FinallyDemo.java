import java.util.Scanner;

public class FinallyDemo {
    public static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }else{
            System.out.println("Result : "+a/b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        try{
            divide(a, b);
        }catch(ArithmeticException e){
           System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally block is executed");
        }
    }
}
