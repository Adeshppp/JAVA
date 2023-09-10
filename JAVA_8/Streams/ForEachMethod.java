package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(10,0,15,5,20));
        System.out.println(l);
        l.stream().forEach(System.out::println);
        Consumer<Integer> f = i -> System.out.println("Square of "+i+" : "+i*i);
        l.stream().forEach(f);
    }
}
