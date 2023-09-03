package JAVA_8.predefined_Functional_Interface.Function.UnaryOperator;

import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        UnaryOperator<Integer> f = i -> i*i;
        System.out.println(f.apply(4));
    }
}
