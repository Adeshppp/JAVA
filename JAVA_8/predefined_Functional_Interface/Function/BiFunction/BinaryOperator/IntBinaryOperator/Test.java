package JAVA_8.predefined_Functional_Interface.Function.BiFunction.BinaryOperator.IntBinaryOperator;

import java.util.function.IntBinaryOperator;

public class Test {
    public static void main(String[] args) {
        IntBinaryOperator f = (a,b) -> a*b;
        System.out.println(f.applyAsInt(2,3));
    }
}
