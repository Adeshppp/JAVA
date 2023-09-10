package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(List.of(0,5,10,15,20,25,30));
        List<Integer> l1 = l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l);
        System.out.println(l1);
    }
}
