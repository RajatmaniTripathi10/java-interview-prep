package Factory;

import java.util.Scanner;

interface Authenticator{
    void authenticate();
}
enum Authenticatetype{
    GOOGLE,FB,EMAIL;
}
class GoogleAuth implements Authenticator{
    public void authenticate(){
        System.out.println("Authentication via Google!");
    }
}
class FacebookAuth implements Authenticator{
    public void authenticate(){
        System.out.println("Authentication via FaceBook!");
    }
    
}
class EmailAuth implements Authenticator{
    public void authenticate(){
        System.out.println("Authentication via Email!");
    }
}

class AuthFactory{
    public static Authenticator getType(Authenticatetype type){
        if (type == null) return null;
        switch(type){
            case GOOGLE :
                return new GoogleAuth();
            case FB :
                return new FacebookAuth();
            case EMAIL :
                return new EmailAuth();
            default:
                throw new IllegalArgumentException("Invalid authentication type");
        }
    }
}
public class AuthenticationMechanism{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose authentication type GOOGLE,FB,EMAIL ");
        String s=sc.next();
        try{
            Authenticatetype type=Authenticatetype.valueOf(s.toUpperCase());
            Authenticator auth=AuthFactory.getType(type);
            if(auth!=null){
                auth.authenticate();
            }
            
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        
        
    }
}
