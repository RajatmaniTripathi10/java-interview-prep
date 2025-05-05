import java.util.Scanner;

public class LongestPalindromicSubstring {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str=sc.nextLine();
    System.out.println(reverse(str));

   }
   public static int expandAroundCenter(int left,int right,String str){
        while (left>=0 && right<str.length()-1 && str.charAt(left)==str.charAt(right)) { 
            left--;
            right++;
        }
        return right-left-1;
   }
   public static String reverse(String str){
    if(str==null || str.isEmpty()){
        return "";
    }
    int start=0,end=0;
    for(int i=0;i<=str.length()-1;i++){
        int len1=expandAroundCenter(i, i, str);
        int len2=expandAroundCenter(i, i+1, str);
        int len=Math.max(len1, len2);
        if(len>end-start){
            end=i+len/2;
            start=i-(len-1)/2;
        }
    }
    return str.substring(start,end+1);
   }
}
