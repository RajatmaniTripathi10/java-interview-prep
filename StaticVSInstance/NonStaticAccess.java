// Can you access a non-static variable from a static method? Why or why not?

class Demo {
    static int staticVar = 10; 
    int instanceVar = 20;

    public static void display() {
        System.out.println("Static variable: " + staticVar);

        // Creating an instance of UtilityClass to access the instance variable
       Demo ob=new Demo();
        System.out.println("Instance variable: " + ob.instanceVar);
    }
}

public class NonStaticAccess { 
    public static void main(String[] args) {
        Demo.display(); 
    }
}
