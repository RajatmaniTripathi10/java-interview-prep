public class Person {

    //instance varibale
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name; //here this refer to the instance variable
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age :"+this.age);
    }

   // Method to compare two Person objects
    public boolean isSameAge(Person other) {
        // Using 'this' to refer to the current object
        return this.age == other.age;
    }

    // Method to demonstrate passing the current object
    public void compareWith(Person other) {
        if (this.isSameAge(other)) {
            System.out.println(this.name + " and " + other.name + " are of the same age.");
        } else {
            System.out.println(this.name + " and " + other.name + " are of different ages.");
        }
    }


    public static void main(String[] args) {
        Person p1=new Person("Rajat", 25);
        Person p2=new Person("Alice", 20);
        p1.displayInfo();
        p2.displayInfo();
        p1.compareWith(p2);

    }

}
