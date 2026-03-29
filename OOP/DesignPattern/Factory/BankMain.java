package Factory;

import java.util.Scanner;

interface Bank{
    void calculateInterest();
}
enum AccountType{
    SB,CURRENT, FD;
}
class SavingBank implements Bank{
    public void calculateInterest(){
        System.out.println("Interest is getting calculate for SB account");
    }
}
class Current implements Bank{
    public void calculateInterest(){
        System.out.println("Interest is getting calculate for Current account");
    }
}
class Fixed implements Bank{
    public void calculateInterest(){
        System.out.println("Interest is getting calculate for FD");
    }
}

class BankFactory{
    public static Bank getType(AccountType type){
        if(type==null){
            System.out.println("Null type");
             return null;
        }
        switch(type){
            case SB :
                return new SavingBank();
            case CURRENT :
                return new Current();
            case FD:
                return new Fixed();
            default :
                throw new IllegalArgumentException("Invalid account type");
        }
    }
}

public class BankMain {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account type SB, CURRENT or FD");
        String s=sc.next();
        AccountType type=AccountType.valueOf(s.toUpperCase());
        Bank bank = BankFactory.getType(type);
        bank.calculateInterest();
    }
}
