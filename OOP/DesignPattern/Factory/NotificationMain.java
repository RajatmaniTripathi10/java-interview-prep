package Factory;
import java.util.Scanner;

interface Notification{
    void sendNotification();
}
enum Notificationtype{
    EMAIL , SMS;
}

class Email implements Notification{
    public void sendNotification(){
        System.out.println("Sending via EMAIL");
    }
}
class SMS implements Notification{
    public void sendNotification(){
        System.out.println("Sending via SMS");
    }
}

class NotifictionFactory{
    public static Notification getType(Notificationtype type){
        if(type==null){
            System.out.println("Please select a type");
            return null;
        }
        switch(type){
            case EMAIL :
                return new Email();
            case SMS:
                return new SMS();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}

public class NotificationMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a type EMAIL or SMS");
        String s=sc.next();
        Notificationtype type=Notificationtype.valueOf(s.toUpperCase());
        Notification notification=NotifictionFactory.getType(type);
        notification.sendNotification();
    }
}