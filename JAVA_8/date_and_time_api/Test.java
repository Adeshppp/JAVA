package JAVA_8.date_and_time_api;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);
    }
}
