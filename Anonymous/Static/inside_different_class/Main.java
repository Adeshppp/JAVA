package Anonymous.Static.inside_different_class;

public class Main {
    public static void main(String[] args) {
        System.out.println(Test.i);
        Test.display();
    }
    static{
        System.out.println("Static block from main method");
    }
}
