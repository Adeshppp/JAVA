package JAVA_8.lambda_expressions.withFunctionalInterface.eg2;

public class Test {
    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.add(2,3);

        Interf i = (a,b) -> System.out.println("Sum is "+ (a+b));
        i.add(3,4);
    }
}
