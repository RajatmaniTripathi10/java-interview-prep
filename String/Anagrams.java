import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first String : ");
    String str1=sc.nextLine();
    System.out.println("Enter second String : ");
    String str2=sc.nextLine();
    System.out.println(isAnagram(str1, str2));
  } 
  public static boolean isAnagram(String str1,String str2) {
    if(str1.length()!=str2.length()){
      return false;
    }
    char[] strArr1=str1.toLowerCase().toCharArray();
    char[] strArr2=str2.toLowerCase().toCharArray();

    Arrays.sort(strArr1);
    Arrays.sort(strArr2);

    if(Arrays.equals(strArr1, strArr2)){
      return true;
    }
    return false;
  }
}