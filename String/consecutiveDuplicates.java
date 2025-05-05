
import java.util.Scanner;


public class consecutiveDuplicates {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str=sc.nextLine();
    System.out.println(isDplicate(str));
  }
  public static boolean isDplicate(String str){
    for(int i=0;i<str.length()-1;i++){
      char ch1=str.charAt(i);
      char ch2=str.charAt(i+1);
      if(ch1==ch2){
        return true;
      }
    }
    return false;
  }
}