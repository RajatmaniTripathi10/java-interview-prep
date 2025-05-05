
// What is a static block in Java, and when is it executed?

class InnerStaticBlock {
    static int staticVar;
    static {
        System.out.println("Static block executed");
        staticVar = 10;
    }
    public static void display(){
        System.out.println("Static method showing static var : "+staticVar);
    }
    
}
public class StaticBlock {
    public static void main(String[] args) {
        InnerStaticBlock.display();
    }
}
