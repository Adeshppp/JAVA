package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l =  new ArrayList<>(List.of(10,0,15,5,20));
        Integer[] i = l.stream().toArray(Integer[]::new);
        for(Integer i1 : i) System.out.println(i1);
    }
}
