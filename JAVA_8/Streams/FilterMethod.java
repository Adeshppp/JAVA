package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>(List.of(0,5,10,15,20,25,30));
        System.out.println(l);
        List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
    }
}
