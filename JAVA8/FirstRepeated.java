import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstRepeated {
    public static void main(String[] args) {
        String s = "aabbcde";
        Character character=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                            .entrySet().stream().filter(c->c.getValue()>1).map(c->c.getKey()).findFirst().orElse(null);
                System.out.println(character);
    }
}
