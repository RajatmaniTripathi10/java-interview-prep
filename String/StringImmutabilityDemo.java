
public class StringImmutabilityDemo  {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("str1 == str2 before modification :"+(str1==str2));
        
        //Attempting to modify str1 by concatenating another string
        str1=str1+"World";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("str1 == str2 after modification : "+(str1==str2));
    }    
}
