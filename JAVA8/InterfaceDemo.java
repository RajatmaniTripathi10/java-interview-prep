interface A{
    default void diaplay(){
        System.out.println("In display of A");
    }
}
interface B{
    default void display(){
        System.out.println("In display of B");
    }
    public static void staticMethod(){
        System.out.println("This is static method");
    }
}
class Myclass implements A,B{
    @Override
    public void display(){
        A.super.diaplay();
    }
}

public class InterfaceDemo  {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.diaplay();
        B.staticMethod();
    }
}
