package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(List.of(70,45,10,65,20,25));
        System.out.println(marks);
        long noOfFailedStudents = marks.stream().filter(i->i<35).count();
        System.out.println(noOfFailedStudents);
    }
}
