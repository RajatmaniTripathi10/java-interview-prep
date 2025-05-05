import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingChar {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str=sc.nextLine();
    char res=nonRepeating(str);
    if(res!='\0'){
      System.out.println("First non repeating character : "+res);
    }else{
      System.out.println("No non repeating character");
    }
  }
  public static char nonRepeating(String str){
    Map<Character,Integer> map=new LinkedHashMap<>();
    for(int i=0;i<=str.length()-1;i++){
      char ch=str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    for(char ch:str.toCharArray()){
      if(map.get(ch)==1){
        return ch;
      }
    }
    return '\0';
  }
}