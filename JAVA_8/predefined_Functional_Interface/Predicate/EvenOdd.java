package JAVA_8.predefined_Functional_Interface.Predicate;

import java.util.function.Predicate;

public class EvenOdd {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));
    }
}
