import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
   int marks;
   String name;

   Student(int marks,String name){
    this.marks=marks;
    this.name=name;
   }

   public int compareTo(Student other){
    return this.marks-other.marks;
   }

   public String toString(){
    return name+" : "+marks;
   }
}
public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> lst=new ArrayList<>();
        lst.add(new Student(90, "Alice"));
        lst.add(new Student(88, "Marry"));
        lst.add(new Student(96, "Bob"));

        Collections.sort(lst);
        System.out.println("Sorted by marks : "+lst);
    }
}