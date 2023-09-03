package JAVA_8.predefined_Functional_Interface.Function.IntToDoubleFunction;

import java.util.function.IntToDoubleFunction;

public class Test {
    public static void main(String[] args) {
        IntToDoubleFunction f = a -> Math.sqrt(a);
        System.out.println(f.applyAsDouble(7));
    }
}
