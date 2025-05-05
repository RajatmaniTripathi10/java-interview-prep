//What would happen if you have two overloaded methods with the same parameter types but different return types?

class Example{
    double add(int a,double b){
        return a+b;
    }
    double add(double a,int b){
        return a+b;
    }
    // double add(int a , double b){ //This is Ambiguity error at compile time 
    //     return a+b;
    // }
}

public class Ambiguity {
    public static void main(String[] args) {
        Example ex=new Example();
        System.out.println(ex.add(2, 3.0));
        System.out.println(ex.add(3.0, 2));
    }
    
}
