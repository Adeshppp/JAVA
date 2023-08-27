package JAVA_8.predefined_Functional_Interface.Function;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i*i;
        System.out.println("Square of a number : "+f.apply(12));

        Function<String, Integer> f1 = s -> s.length();
        System.out.println("Length of a string : "+f1.apply("Adesh Pandurang Padwal"));

        Function<String, String> f2 = s -> s.toUpperCase();
        System.out.println("Upper case : "+f2.apply("adesh"));
    }
}
