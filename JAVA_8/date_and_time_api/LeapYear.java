package JAVA_8.date_and_time_api;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

        System.out.print("Enter year : ");
        int i = sc.nextInt();
        Year year = Year.of(i);
        if(year.isLeap()) System.out.printf("%d is a leap year.",i);
        else System.out.printf("%d is not a leap year",i);
            System.out.println();
        }
    }
}
