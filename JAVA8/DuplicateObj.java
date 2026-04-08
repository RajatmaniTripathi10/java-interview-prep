import java.util.*;
import java.util.stream.*;

class User{
    int id;
    String username;
    
    public User(int id, String username ){
        this.id=id;
        this.username=username;
    }
    
    public String getUsername(){
        return username;
    }
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof User)) return false;
        User user=(User) o;
        return Objects.equals(this.username,user.username);
    }
    
    public int hashCode(){
        return Objects.hash(username);
    }
    
    public String toString(){
        return "User {id : "+id+" username : "+username+" }";
    }
}
public class DuplicateObj{
    public static void main(String[] args){
        List<User> lst=List.of(
            new User(100,"Joe"),
            new User(101,"Jane"),
            new User(102,"Joe"),
            new User(103,"Jack"),
            new User(104,"Jane")
            );
    System.out.println(lst);
    Set<User> seen=new HashSet<>();
    Set<User> duplicate=lst.stream()
                        .filter(n->!seen.add(n))
                        .collect(Collectors.toSet());
    System.out.println(duplicate);
    }
}