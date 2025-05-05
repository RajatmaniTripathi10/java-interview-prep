//Is it possible to overload main() method in Java? If yes, how?

public class MainOverloadExample  {
    public static void main(String s){
        System.out.println("Name : "+s);
    }
    public static void main(int a){
        System.out.println("Age : "+a);
    }
    public static void main(String args[]){
        main("Rajat");
        main(10);
    }
}
