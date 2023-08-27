package JAVA_8.predefined_Functional_Interface.Predicate.PredicateJoining;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {0,5,10,15,20,25,30};
        Predicate<Integer> p1 = num -> num%2==0;
        Predicate<Integer> p2 = num -> num>10;

        // and() method
        System.out.println("The numbers which are even AND greater than 10 are ");
        for(int num : numbers) if (p1.and(p2).test(num)) System.out.println(num);

        // or() method
        System.out.println("The numbers which are even OR greater than 10 are ");
        for(int num : numbers) if (p1.or(p2).test(num)) System.out.println(num);

        System.out.println("The numbers which are even  ");
        for(int num : numbers) if (p1.test(num)) System.out.println(num);

        // negate() method
        System.out.println("The numbers which are NOT even  ");
        for(int num : numbers) if (p1.negate().test(num)) System.out.println(num);


    }
}
