//Is it possible to overload a method in the child class with the same method name as in the parent class? Why or why not?
class Parent {
    void display(int a) {
        System.out.println("Parent class display with integer: " + a);
    }
}

class Child extends Parent {
    // Overloading display method with a different parameter type
    void display(String str) {
        System.out.println("Child class display with string: " + str);
    }
}

public class Overload{
    public static void main(String[] args) {
        Child child = new Child();
        child.display(10);          // Calls Parent's display(int)
        child.display("Hello");     // Calls Child's display(String)
    }
}

