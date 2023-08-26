package JAVA_8.lambda_expressions.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1);
        list.add(34);
        list.add(2);
        list.add(9);
        list.add(100);
        System.out.println(list);
//        Collections.sort(list, new MyComparator() );
        Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(list, c);
        System.out.println(list);
    }
}
