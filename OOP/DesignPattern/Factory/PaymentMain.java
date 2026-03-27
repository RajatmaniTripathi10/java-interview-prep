package Factory;
import java.util.Scanner;

 interface Payment {

    void pay();
}

enum PaymentType{
    CARD, UPI;
}

class Card implements Payment{
    public void pay(){
        System.out.println("Payment via Card");
    }
}

class Upi implements Payment{
    public void pay(){
        System.out.println("Payment via UPI");
    }
}

class PaymentFactory{
    public static Payment getType(PaymentType type){
        switch(type){
            case CARD :
                return new Card();
            case UPI :
                return new Upi();
            default :
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
public class PaymentMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a type CARD or UPI");
        String s=sc.next();
        PaymentType type=PaymentType.valueOf(s.toUpperCase());
        Payment payment=PaymentFactory.getType(type);
        payment.pay();
        
    }
}