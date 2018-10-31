package formattingDates_LocalDateTime20_21;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


/**
 * Created by Daniel_D'AGE on 31.10.2018.
 */


public class LocalTime {
    public static void main(String[] args) {

        //strefy czasowe
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = ZoneId.of("Europe/Oslo");
        ZoneId zone2 = ZoneId.of("America/Los_Angeles");

        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());


        java.time.LocalTime loc1 = java.time.LocalTime.now(zone1);
        System.out.println(loc1);

        java.time.LocalTime loc2 = java.time.LocalTime.now(zone2);
        System.out.println(loc2);

        // obliczenie różnicy pomiędzy strefami czasowymi
        long differenceOfHours = ChronoUnit.HOURS.between(loc1, loc2);
        System.out.println("Róznicaw godzinach, pomiędzy strefami: " + differenceOfHours);

        long differenceOfMin = ChronoUnit.MINUTES.between(loc1, loc2);
        System.out.println("Róznica w minutach, pomiędzy strefami: " + differenceOfMin);

        //przekazywanie czasu
        java.time.LocalTime time = java.time.LocalTime.of(12, 9);
        System.out.println(time);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.US);

        //LocalTime time1 = LocalTime.parse("07:37 PM", formatter);
        //System.out.println(time1);

        // Odejmowanie godzin od strefy czasowej
        java.time.LocalTime time2 = loc1.minusHours(3);
        System.out.println(time2);

        java.time.LocalTime time3 = loc2.plusMinutes(45);
        System.out.println(time3);

        //LocalDATE

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate tomorrow = today.plusDays(1); //jaka data jutro
        System.out.println(tomorrow);

        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        LocalDate day = LocalDate.of(2018, 10,31);
        System.out.println(day);

        DayOfWeek dayOfWeek = day.getDayOfWeek();
        System.out.println(dayOfWeek);

        DateTimeFormatter  formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.getDefault());

        //LocalDate date = LocalDate.parse("17.12.2018", formatter1);
        //System.out.println("Data sformatowana: " + date);

        LocalDateTime localDateTime = LocalDateTime.of(2018,12,31,23,59,59);
        System.out.println(localDateTime);

        DayOfWeek dayOfWeek1 = localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek1);




    }
}


