import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String : ");
      String str=sc.nextLine();
      charCount(str);
   }
   public static void charCount(String str){
      Map<Character,Integer> map=new HashMap<>();
      for(int i=0;i<=str.length()-1;i++){
         char ch=str.charAt(i);
         map.put(ch,map.getOrDefault(ch, 0)+1);
      }
      for(char ch:map.keySet()){
         System.out.println(ch+" : "+map.get(ch));
      }
   }
}