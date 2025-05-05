import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println(removeDup(str));
    }
    public static String removeDup(String str){
        Set<Character> set=new LinkedHashSet();
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            set.add(ch);
        }
        StringBuffer sb=new StringBuffer();
        for(char ch:set){
            sb.append(ch);
        }
        return sb.toString();
    }
}