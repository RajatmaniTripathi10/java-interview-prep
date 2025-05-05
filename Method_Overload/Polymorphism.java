//Create a method `add()` that takes two, three, and four integers to showcase method overloading.

public class Polymorphism{
    public int add(int a, int b){
        return a+b;
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Polymorphism pm = new Polymorphism();
        System.out.println(pm.add(2,5));
        pm.add(2,2,2);
        System.out.println(pm.add(2,2,2,2));
    }
}