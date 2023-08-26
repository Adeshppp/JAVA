package JAVA_8.lambda_expressions.ApplicationClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("D",3122312));
        list.add(new Employee("B",7634562));
        list.add(new Employee("C",6532673));
        list.add(new Employee("A",6473646));
        System.out.println(list);
        Comparator<Employee> c = (l1,l2)->(l1.name.compareTo(l2.name));
        Collections.sort(list,c);
        System.out.println(list);
    }
}
