package JAVA_8.predefined_Functional_Interface.Function.ToIntFunction;

import java.util.function.ToIntFunction;

public class Test {
    public static void main(String[] args) {
        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("Adesh"));
    }
}
