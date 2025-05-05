
import java.util.Scanner;

public class RightmostDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Right most digit : "+rightMostDigit(str));
    } 
    public static int rightMostDigit(String str) {
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                return Character.getNumericValue(ch);
            }
        }
        return 0;
    }
}
