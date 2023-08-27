package JAVA_8.predefined_Functional_Interface.Predicate;

import java.util.function.Predicate;

public class StringLength2 {
    public static void main(String[] args) {
        String[] names = {"Adesh","Pandurang","Padwal"};
        Predicate<String> p = s -> s.length()>5;
        for(String name: names) if(p.test(name)) System.out.println(name);
    }
}
