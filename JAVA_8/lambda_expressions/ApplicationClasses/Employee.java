package JAVA_8.lambda_expressions.ApplicationClasses;

public class Employee {
    String name;
    int employeeNumber;
    Employee(String name, int employeeNumber){
        this.name=name;
        this.employeeNumber=employeeNumber;
    }

    public String toString(){
        return name+" : "+employeeNumber;
    }
}
