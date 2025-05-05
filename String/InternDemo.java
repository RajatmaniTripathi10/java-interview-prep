public class InternDemo {
    public static void main(String args[]){
        String str1=new String("Rajat"); //Memory will be in heap
        String str2=new String("Rajat").intern(); //Memory will be in String Constant Pool
        String str3="Rajat"; //Memory will be in String Constant Pool

        System.out.println("Is str1 and str2 same object? "+(str1==str2));
        System.out.println("Is str1 and str3 same object? "+(str1==str3));
        System.out.println("is str2 and str3 are same object? "+(str2==str3));
    }
}
