import java.util.Scanner;

class InvalidAgeException  extends Exception {
    public InvalidAgeException(String str)   {
        super(str);
    }
}

public class CustomException{
    public static void checkAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is less than 18");
        }else{
            System.out.println("Age is valid");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
