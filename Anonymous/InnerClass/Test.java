package Anonymous.InnerClass;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        A.B b = a.new B();
        b.config();
    }
}
