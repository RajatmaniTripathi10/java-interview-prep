//What is abstraction, and how is it implemented in Java?

abstract class Shape  {
    public abstract double CalculateArea(); //Abstract Method no implementation

    public void display(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    private double radius=2.2;

    @Override
    public double CalculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public void display(){
        System.out.println("This is a cricle");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.display();
        System.out.println("Area : " + shape.CalculateArea());
    }
    
}
