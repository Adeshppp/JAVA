package JAVA_8.predefined_Functional_Interface.Predicate.BiPredicate;

import java.util.function.BiPredicate;

public class EvenOrOdd {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p = (a,b)->(a+b)%2==0;
        System.out.println(p.test(3,3));
    }
}
