package JAVA_8.predefined_Functional_Interface.Predicate;

import java.util.function.Predicate;

public class StringLength {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length()>5;
        System.out.println(p.test("Adesh Padwal"));
    }
}
