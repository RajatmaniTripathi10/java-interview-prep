
import java.util.*;

class StudentC {
    int id;
    String name;
    int marks;

    public StudentC(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID : "+id + " Name  : " + name + " Marks: " + marks;
    }
}

class MarksSorted implements Comparator<StudentC> {
    public int compare(StudentC s1, StudentC s2) {
        return s1.marks - s2.marks;
    }
}

class IdSorted implements Comparator<StudentC> {
    public int compare(StudentC s1, StudentC s2) {
        return s1.id - s2.id;
    }
}

class NameSorted implements Comparator<StudentC> {
    public int compare(StudentC s1, StudentC s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<StudentC> lst = new ArrayList<>();
        lst.add(new StudentC(100, "Rajat", 67));
        lst.add(new StudentC(120, "Saurav", 88));
        lst.add(new StudentC(10, "Abhay", 90));
        lst.add(new StudentC(101, "Rohit", 35));
        lst.add(new StudentC(80, "Mayank", 97));
        
        lst.add(new StudentC(90, "Pooja", 45));
        Collections.sort(lst, new IdSorted());
        System.out.println("Sorted via ID: " + lst);
        Collections.sort(lst, new NameSorted());
        System.out.println("Sorted via Name: " + lst);
        Collections.sort(lst, new MarksSorted());
        System.out.println("Sorted via Marks: " + lst);
    }
}