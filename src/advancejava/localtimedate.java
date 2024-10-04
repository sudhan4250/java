package advancejava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;



public class localtimedate {
    public static void main(String[] args) {
        LocalDate on=LocalDate.now();
        System.out.println("date"+on);

        LocalTime in=LocalTime.now();
        System.out.println("time"+in);

        LocalDateTime i=LocalDateTime.now();
        System.out.println("current"+i);

        DateTimeFormatter o=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime =i.format(o);
        System.out.println(formatedDateTime);

        Month month = i.getMonth();
        int Date=i.getDayOfMonth();
        int second=i.getSecond();

        LocalDate j=LocalDate.of(2024,3,03);
        System.out.println(j);

        LocalDate k=on.withDayOfMonth(24).withYear(2016);
        System.out.println(k);



    }
}
