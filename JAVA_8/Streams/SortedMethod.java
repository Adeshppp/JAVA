package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        ArrayList<String> marks = new ArrayList<>(List.of("Malika","Kajal","Anushka","Prabhas","Deeepu"));
        System.out.println(marks);
        // Natural sorting order
//        Comparator<Integer> comparator = (i1,i2) -> i2.compareTo(i1);
        List<String> failedStudents = marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(failedStudents);
    }
}
