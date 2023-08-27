package JAVA_8.predefined_Functional_Interface.Function.Grader;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Function<Student, String> f = s ->
                (s.marks>=80)?"A[Distinction].":
                        (s.marks>=60)?"B[First Class].":
                                (s.marks>=50)?"C[Second class].":
                                        (s.marks>=35)?"D[Third class].":
                                                "E[Failed].";
        Predicate<Integer> p = marks -> marks>=60;
        Student[] students = {
                new Student("Adesh",99),
                new Student("Nilesh",29),
                new Student("Vishal",79),
                new Student("Abhi",49),
                new Student("Avinash",39)
        };
        for(Student student : students)
            if(p.test(student.marks))
                System.out.println("Grade of "+ student.name+" is "+f.apply(student));
    }
}
