package JAVA_8.lambda_expressions.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Kiran"));
        students.add(new Student(2,"Adi"));
        students.add(new Student(3,"Vedu"));

        System.out.println(students);

        Comparator<Student> idComparator = (student1, student2)->student1.getId()<student2.getId()?1:student1.getId()>student2.getId()?-1:0;
        Collections.sort(students,idComparator);
        System.out.println(students);

        Comparator<Student> nameLengthComparator = (student1, student2)->student1.getName().length()<student2.getName().length()?1:student1.getName().length()>student2.getName().length()?-1:0;
        Collections.sort(students,nameLengthComparator);
        System.out.println(students);
    }
}
