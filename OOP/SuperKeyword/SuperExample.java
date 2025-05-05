class SuperDemo {
    String str="Rajat";
    int age=25;
    public SuperDemo(String str,int age){
        this.str=str;
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+str+"\nAge : "+age);
    }
}

class Person extends SuperDemo{
    public Person(String str,int age){
        super(str,age);
    }
    public void display(){
        super.display();
    }
}
public class SuperExample{
    public static void main(String[] args) {
        Person p1=new Person("John", 20);
        p1.display();
    }
}
