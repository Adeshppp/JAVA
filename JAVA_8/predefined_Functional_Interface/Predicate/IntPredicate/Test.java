package JAVA_8.predefined_Functional_Interface.Predicate.IntPredicate;

import java.util.function.IntPredicate;

public class Test {
    public static void main(String[] args) {
        IntPredicate p = (a)->a%2==0;
        System.out.println(p.test(2));
        System.out.println(p.test(3));
        System.out.println(p.test(4));

    }
}
