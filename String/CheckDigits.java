
import java.util.Scanner;


public class CheckDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        if(isDigit(str)){
            System.out.println(str+" contains only digit");
        }else{
            System.out.println(str+" does not contain only digit");
        }
    }
    public static boolean isDigit(String str){
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
}