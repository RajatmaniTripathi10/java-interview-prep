import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;
    
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public int compareTo(Student s){
        return this.id-s.id;
    }

    public String toString(){
        return id+" : "+name;
    }
}

public class ComparableDemo{
    public static void main(String[] args){
        List<Student> lst=new ArrayList<>();
        lst.add(new Student(100,"Rajat"));
        lst.add(new Student(101,"Rohit"));
        lst.add(new Student(88,"Mayank"));
        lst.add(new Student(94,"Lavanya"));
        lst.add(new Student(45,"Pooja"));
        
        Collections.sort(lst);
        System.out.println(lst);
    }
}