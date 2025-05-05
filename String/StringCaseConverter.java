//How can you convert a string to uppercase or lowercase without using built-in methods?

import java.util.Scanner;

public class StringCaseConverter  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();

        System.out.println("Uppercase : "+toUpperCase(str));
        System.out.println("Lowercase : "+toLowerCase(str));
    }
    public static String toUpperCase(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char) (ch-32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static String toLowerCase(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                 ch=(char) (ch+32);
            }
            result.append(ch);
        }
        return result.toString();
       
    }
 
}
