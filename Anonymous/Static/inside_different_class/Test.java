package Anonymous.Static.inside_different_class;

public class Test {
    static int i = 10;
    static void display(){
        System.out.println("Static method");
    }
    static{
        System.out.println("Static block from test class");
    }
}
