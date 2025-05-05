// Can you create an instance of a class with only static methods? How to call the methods?

class UtilityClass{
    public static void show(){
        System.out.println("This is a static method");
    }
}


public class staticDemo {
    public static void main(String[] args) {
        //Display static method with className.methodName syntax
        UtilityClass.show();

        //Display sttaic method using instance of the class (Not recommended)
        UtilityClass obj = new UtilityClass();
        obj.show();
    }
}
