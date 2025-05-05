//Check if a string is a palindrome.

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str=sc.nextLine();
    if(isPalindrome(str)){
        System.out.println(str+" is Palindrome");
    }else{
        System.out.println(str+" is not Palindrome");
    }
   }
   public static boolean isPalindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        return false;
   }
    
}
