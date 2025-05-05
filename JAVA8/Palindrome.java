// Palindrome using JAVA8

import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(str)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}