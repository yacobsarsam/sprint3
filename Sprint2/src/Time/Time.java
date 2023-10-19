package Time;

import ovning9.Person;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        Instant t = Instant.now();
        //System.out.println(t);
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(13,15,20);

        LocalTime t3 = LocalTime.parse("13:56:24");
        //System.out.println(t1);
        //System.out.println(t2);
        //System.out.println(t3);
        boolean before = t2.isBefore(LocalTime.now());
        boolean after = t2.isAfter(LocalTime.now());
        System.out.println(t3);

        System.out.println(t3.minusMinutes(30));
        LocalDate l = LocalDate.now();
        System.out.println(l.lengthOfYear());
        LocalDateTime ll = LocalDateTime.now();
        System.out.println(ll);
        System.out.println(ll.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(ll.format(DateTimeFormatter.ofPattern("mm:HH:ss")));
        System.out.println(ll.format(DateTimeFormatter.ofPattern("YYYY mm-dd")));

        ZoneId z = ZoneId.of("CET");
        ZonedDateTime s = t.atZone(z);
        System.out.println(s);
Duration d = Duration.between(LocalDateTime.now(),LocalDateTime.now().plusHours(1));
        Period p = Period.between(LocalDate.parse("2023-10-14"),LocalDate.now());
        System.out.println(d.getSeconds());
        System.out.println("Period is: "+p.getYears());
    }
}
