import java.util.Arrays;

public class Student {
    String name;
    int [] marks;
    public Student(String name,int...marks){
        this.name=name;
        this.marks=marks;
    }

    public String toString(){
        return "Name : "+name+" , "+"Marks : "+Arrays.toString(marks);
    }
    public static void main(String[] args) {
        Student stn1=new Student("Rajat", 90,98,95,89);
        Student stn2=new Student("Joe", 78,98,33,67,55);
        System.out.println("Marks of first student : "+stn1.toString());
        System.out.println("Marks of second Student : "+stn2.toString());
    }
}
