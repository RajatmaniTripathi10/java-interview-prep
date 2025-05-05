//What is abstraction, and how is it implemented in Java?

interface Animal  {
    void sound();
    void eat();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Bark");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Cat Meow");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
}
public class InterExample{
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cat=new Cat();
        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();

    }
}

