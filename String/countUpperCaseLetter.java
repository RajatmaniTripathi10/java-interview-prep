
import java.util.Scanner;


public class countUpperCaseLetter {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str=sc.nextLine();
    System.out.println("Number of Uppercase : "+count(str));
  } 
  public static int count(String str)   {
    if(str==null||str.isEmpty()){
      return 0;
    }
    int count=0;
    for(int i=0;i<=str.length()-1;i++){
      char ch=str.charAt(i);
      if(Character.isUpperCase(ch)){
        count++;
      }
    }
    return count;
  }
}