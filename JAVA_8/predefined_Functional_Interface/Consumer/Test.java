package JAVA_8.predefined_Functional_Interface.Consumer;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> c = i -> System.out.println("My name is "+i);
        c.accept("Adesh");
    }
}
