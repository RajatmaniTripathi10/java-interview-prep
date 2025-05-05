class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Singleton Instance is created!");
    }
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public static void display(){
        System.out.println("Message display");
    }
}

public class SingletonDemoThread {

    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        obj1.display();
        obj2.display();
        System.out.println(obj1==obj2);
    }
}