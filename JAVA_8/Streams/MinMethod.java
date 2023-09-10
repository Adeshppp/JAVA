package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(List.of(5,20,0,15,25,20));
        System.out.println(l);
        Comparator<Integer> comparator = (I1,I2) -> -I1.compareTo(I2);
        int min = l.stream().min(comparator).get();
        int max = l.stream().max(comparator).get();
        System.out.println(min);
        System.out.println(max);
    }
}
