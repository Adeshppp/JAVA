package JAVA_8.lambda_expressions.withFunctionalInterface.eg3;

public class Test {
    public static void main(String[] args) {
//        Demo d = new Demo();
//        System.out.println(d.squareIt(2));

        Interf i = (n)-> System.out.println(n*n);
        i.squareIt(12);

    }
}
