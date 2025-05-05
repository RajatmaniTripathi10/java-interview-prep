//Reverse a given string without using the reverse() method.

public class Main {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str=sc.nextLine();
        // System.out.println("Enter another String");;
        // String str2=sc.nextLine();
        // String str3=str.intern();
        // String str4=str2.intern();
        // System.out.println("String before intern having same referece : "+(str==str2));
        // System.out.println("String after being intern having same reference : "+(str3==str4));
        // System.out.println("Va;ue of original Strings : "+str+" "+str2);
        // System.out.println("Value of intern Strings : "+str3+" "+str4);
        // System.out.println("Location hashCode of original Strings : "+System.identityHashCode(str)+" "+System.identityHashCode(str2));
        // System.out.println("Location hashcode of intern Strings : "+System.identityHashCode(str3)+" "+System.identityHashCode(str4));
        String str="Rajat";
        String str1=new String("Rajat");
        String str2=new String("Rajat");
        String str3="Rajat";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str==str3);
        
    }
}
