class Parent{
    public void display(String name,int age){
        System.out.println("Name : "+name+" "+"Age : "+age);
    }
    public void display(int age,String name){
        System.out.println("Name : "+name+" "+"Age : "+age);
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
       Parent p=new Parent();
       p.display(24, "Mansi");
       p.display("Rajat", 25);
    }
}
