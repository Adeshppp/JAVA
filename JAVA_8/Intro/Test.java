package JAVA_8.Intro;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i -> i*i; // return value
        System.out.println("Square of number is "+f.apply(3));

        Predicate<Integer> p = i -> i%2==0; // return true or false
        System.out.println(p.test(4));

    }

}


