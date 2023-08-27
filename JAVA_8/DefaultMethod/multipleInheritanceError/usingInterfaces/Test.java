package JAVA_8.DefaultMethod.multipleInheritanceError.usingInterfaces;

public class Test implements Left, Right{
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
//        t.m2();
    }

    @Override
    public void m1() {
//        System.out.println("Our own m method");
        Left.super.m1();
    }
}
