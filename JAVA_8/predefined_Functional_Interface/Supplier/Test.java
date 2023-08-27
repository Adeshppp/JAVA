package JAVA_8.predefined_Functional_Interface.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Date> s = () -> new Date();
        System.out.println("time is "+s.get());

    }
}
