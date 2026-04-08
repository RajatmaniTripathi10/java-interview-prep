import java.util.*;
import java.util.stream.*;
class User1{
    int id;
    double salary;
    
    public User1(int id, double salary ){
        this.id=id;
        this.salary=salary;
    }
    
    public double getSalary(){
        return salary;
    }
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof User1)) return false;
        User1 User1=(User1) o;
        return Objects.equals(this.salary,User1.salary);
    }
    
    public int hashCode(){
        return Objects.hash(salary);
    }
    
    public String toString(){
        return "User1 {id : "+id+" salary : "+salary+" }";
    }
}
public class SecondHighest{
    public static void main(String[] args){
         List<User1> lst=List.of(
            new User1(100,1000),
            new User1(101,2000),
            new User1(102,3000),
            new User1(103,4000),
            new User1(104,5000),
            new User1(105,6000),
            new User1(106,7000),
            new User1(107,8000),
            new User1(108,9000)
            );
    System.out.println(lst);
    User1 second=lst.stream()
                    .distinct()
                    .sorted(Comparator.comparing(User1::getSalary).reversed())
                    .skip(1)
                    .findFirst().orElse(null);
    System.out.println((second));
    }
}