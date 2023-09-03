package JAVA_8.predefined_Functional_Interface.Function.UnaryOperator.IntUnaryOperator;

import java.util.function.IntUnaryOperator;

public class Test {
    public static void main(String[] args) {
        IntUnaryOperator f = i -> i*i;
        System.out.println(f.applyAsInt(3));
    }
}
