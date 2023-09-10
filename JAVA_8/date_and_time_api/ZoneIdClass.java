package JAVA_8.date_and_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdClass {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);
        System.out.println(dt);

        ZoneId nd = ZoneId.of("Asia/Calcutta");
        ZonedDateTime dt1 = ZonedDateTime.now(nd);
        System.out.println(dt1);

    }
}
