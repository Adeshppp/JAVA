package JAVA_8.predefined_Functional_Interface.Function.IntFunction;

import java.util.function.IntFunction;

public class Test {
    public static void main(String[] args) {
        IntFunction<Integer> f = a -> a*a;
        System.out.println(f.apply(4));
    }
}
