package JAVA_8.date_and_time_api;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1999,3,15);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthDay,today);
        System.out.printf("Your Age is %d years %d months and %d days",p.getYears(), p.getMonths(), p.getDays() );
    }
}
