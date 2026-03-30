package Factory;
import java.util.Scanner;

interface Account {
    void accountType();
}

enum BankType {
    SB, CURRENT, FD
}

class SavingsAccount implements Account {
    public void accountType() {
        System.out.println("IN SB ACCOUNT");
    }
}

class CurrentAccount implements Account {
    public void accountType() {
        System.out.println("IN CURRENT ACCOUNT");
    }
}

class FixedDepositAccount implements Account {
    public void accountType() {
        System.out.println("IN FD ACCOUNT");
    }
}

class BankFactory {
    public static Account getType(BankType type) {
        if (type == null) return null;

        switch (type) {
            case SB:
                return new SavingsAccount();
            case CURRENT:
                return new CurrentAccount();
            case FD:
                return new FixedDepositAccount();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an A/C type: SB, CURRENT or FD");

        String s = sc.next();

        try {
            BankType type = BankType.valueOf(s.toUpperCase());
            Account account = BankFactory.getType(type);

            if (account != null) {
                account.accountType();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid account type!");
        }
    }
}