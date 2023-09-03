package JAVA_8.predefined_Functional_Interface.Function.BiFunction.BinaryOperator;

import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        BinaryOperator<String> f = (a,b) -> a+b;
        System.out.println(f.apply("Adesh"," Padwal"));
    }
}
