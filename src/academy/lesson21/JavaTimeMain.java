package academy.lesson21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class JavaTimeMain {

    public static void main(String[] args) {
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
        LocalTime now3 = LocalTime.now();
        System.out.println(now3);


        LocalDateTime of = LocalDateTime.of(2011, Month.JANUARY, 20, 12, 44, 33, 3210);

        System.out.println(of);

        boolean leapYear = now2.isLeapYear();

        LocalDate of1 = LocalDate.of(2012, 2, 2);
        LocalDate localDate = of1.plusDays(1);

        LocalDate plus = now2.plus(12, ChronoUnit.YEARS);


        LocalDate with = localDate.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate with1 = localDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY));
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();

        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(922337203685L, 807000000, ZoneOffset.UTC);
        System.out.println(localDateTime);
    }
}
