package JAVA_8.predefined_Functional_Interface.Function.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        BiFunction<String, Integer, Employee> f = (name, eno)->new Employee(name, eno);
        employees.add(f.apply("Adesh", 100));
        employees.add(f.apply("Nilesh", 200));
        employees.add(f.apply("Avinash", 300));
        employees.add(f.apply("Vishal", 400));
        employees.add(f.apply("Abhi", 500));
//        Comparator<Employee> c = (a,b)-> (a.eno>b.eno)?-1:(a.eno<b.eno)?1:0;
//        Collections.sort(employees,c);
        for(Employee employee :employees)
            System.out.println(employee.name+"'s employee number is "+employee.eno);
    }
}

