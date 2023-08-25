package JAVA_8.lambda_expressions.withFunctionalInterface.eg1;

public class Test {
    public static void main(String[] args) {
        Interf d = () -> System.out.println("Hello... using Lambda Expression.");
        d.m1();
        d.m1();
        d.m1();
        d.m1();
        d.m1();
        d.m1();
    }
}
