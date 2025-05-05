import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int marks;
    String name;
    Student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
    public String toString(){
        return name+": "+marks;
    }
}
class nameSorted implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class marksSorted implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.marks-s2.marks;
    }
    
}

public class ComparatorDemo {
    public static void main(String [] args){
        List<Student> lst=new ArrayList<>();
        lst.add(new Student(90, "Alice"));
        lst.add(new Student(75, "Bob"));
        lst.add(new Student(88, "Marry"));

        Collections.sort(lst,new nameSorted());
        System.out.println("Sorted by name : "+lst);
        Collections.sort(lst,new marksSorted());
        System.out.println("Sorted by marks : "+lst);
    }
    
}