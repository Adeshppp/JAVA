package JAVA_8.date_and_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {
    public static void main(String[] args) {

        System.out.println("=========== LocalDate =============");
        LocalDate date = LocalDate.now();
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        System.out.println(date);
        System.out.printf("%d-%d-%d\n",mm,dd,yyyy);
        System.out.println();

        System.out.println("=========== LocalTime =============");
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.println(time);
        System.out.printf("%d-%d-%d-%d\n",h,m,s,n );

        System.out.println("=========== LocalDateTime =============");
        LocalDateTime dt = LocalDateTime.now();
        int da = dt.getDayOfMonth();
        int mo = dt.getDayOfMonth();
        int ye = dt.getDayOfMonth();
        System.out.println(dt);
        System.out.println(da);

        System.out.println("=========== LocalDateTimeOf =============");
        LocalDateTime dt1 = LocalDateTime.of(1999,03,15,2,30);
        LocalDateTime dt2 = LocalDateTime.of(1999, Month.MARCH,15,2,30);
        System.out.println(dt1);
        System.out.println(dt2);

        System.out.println("=========== LocalDateTimePlusMonth=============");
        System.out.println(dt1.plusMonths(1));

        System.out.println("=========== LocalDateTimeMiusMonth=============");
        System.out.println(dt1.minusMonths(1));



    }
}
