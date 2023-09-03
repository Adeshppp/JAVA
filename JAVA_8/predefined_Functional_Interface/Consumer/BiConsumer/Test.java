package JAVA_8.predefined_Functional_Interface.Consumer.BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        BiFunction<String, Double, Employee> f = (name, salary)-> new Employee(name, salary);
        employees.add(f.apply("Adesh", 100000.0));
        employees.add(f.apply("Nilesh", 92000.0));
        employees.add(f.apply("Avinash", 83000.0));
        employees.add(f.apply("Vishal", 94000.0));
        employees.add(f.apply("Abhi", 90500.0));

        BiConsumer<Employee, Double> c = (employee, bonusInPercentage) -> employee.salary+= employee.salary*bonusInPercentage/100;

        for(Employee employee :employees) System.out.println("Salary of "+employee.name+" is "+employee.salary);
        for(Employee employee : employees) c.accept(employee,12.5);
        for(Employee employee :employees) System.out.println("Updated salary of "+employee.name+" is "+employee.salary);
    }
}
