//Write overloaded methods for calculating the area of a circle, a rectangle, and a triangle. 

public class Area {

    public double circle(double r){
        return Math.PI*Math.pow(r, 2);
    }
    public int rectangle(int l,int b){
        return l*b;
    }
    public int triangle(int b,int h){
        return (b*h)/2;
    }
    public static void main(String[] args) {
        Area ob=new Area();
        System.out.println("Area of circle with radius 5 is "+ob.circle(5));
        System.out.println("Area of rectangle with length 4 and breadth 5 is "+ob.rectangle(10, 5));
        System.out.println("Area of triangle with base 5 and height 10 is "+ob.triangle(5, 10));
    }
}