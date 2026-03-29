package Factory;

import java.util.Scanner;

interface Shape{
    void draw();
}

enum Shapetype{
    CIRCLE, RECTANGLE,SQUARE;
}
class Circle implements Shape {
    public void draw(){
        System.out.println("Circle is draw");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle is draw");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Square is draw");
    }
}

class ShapeFactory{
    public static Shape getShape(Shapetype type){
        switch(type){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
public class ShapeMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a type CIRCLE, RECTANGLE or SQUARE");
        String s=sc.next();
        Shapetype type=Shapetype.valueOf(s.toUpperCase());
        Shape shape=ShapeFactory.getShape(type);
        
        shape.draw();
    }
}
