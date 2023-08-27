package JAVA_8.predefined_Functional_Interface.Predicate.ownClassImplementation;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Adesh", 50));
        employees.add(new Employee("Sakshee", 40));
        employees.add(new Employee("Piyush", 80));
        employees.add(new Employee("Shubham", 20));
        employees.add(new Employee("Tejas", 15));
        employees.add(new Employee("Omkar", 90));

        Predicate<Employee> p = e -> e.salary>40;

        for(Employee employee : employees) if(p.test(employee)) System.out.println(employee.name+" : "+employee.salary);
    }
}
