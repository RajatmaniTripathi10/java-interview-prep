
interface FunctionalDemo{
    public int add(int a,int b);
    default void display(){
        System.out.println("This is default method");
    }
}
class Calculate implements FunctionalDemo{
    public int add(int a,int b){
       return a+b;
    }
}
public class FuntionalInterDemo  {
    public static void main(String[] args) {
        FunctionalDemo fd=(a,b)->a+b;
        System.out.println(fd.add(10, 20));
        fd.display();
        
    }
}
