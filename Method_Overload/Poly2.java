//Write a program to show how Java uses method overloading to handle different types of arguments (e.g., int, double, float) in a method called `multiply()`.

public class Poly2{
    public int multiply(int a,int b){
        return a*b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public float multiply(float a,float b){
        return (float)a*b;
    }
    public static void main(String[] args) {
      Poly2 p2=new Poly2();
      System.out.println(p2.multiply(5,6)); 
      System.out.println(p2.multiply(5.5,6.6));
      System.out.println(p2.multiply(5.5f,6.6f));
    }
}
