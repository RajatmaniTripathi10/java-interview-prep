package Factory;

import java.util.Scanner;

interface Pizza{
    void prepare();
    void bake();
}
enum pizzaType{
    VEG, CHICKEN;
}
class Veg implements Pizza{
    public void prepare(){
        System.out.println("VEG Pizza is getting prepared");
    }
    public void bake(){
        System.out.println("VEG Pizza is getting baked");
    }
}
class Chicken implements Pizza{
    public void prepare(){
        System.out.println("Chicken Pizza is getting prepared");
    }
    public void bake(){
        System.out.println("Chicken Pizza is getting baked");
    }
}

class PizzaFactory{
    public static Pizza getType(pizzaType type){
        if(type==null){
            System.out.println("Please select a type");
            return null;
        }
        switch(type){
            case VEG :
                return new Veg();
            case CHICKEN :
                return new Chicken();
            default :
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
public class PizzaMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pizza type VEG or CHICKEN");
        String s=sc.next();
        pizzaType type=pizzaType.valueOf(s.toUpperCase());
        Pizza pizza=PizzaFactory.getType(type);
        pizza.prepare();
        pizza.bake();
        
        
    }
}