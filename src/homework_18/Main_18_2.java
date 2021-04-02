package homework_18;

import java.time.*;
import java.util.Date;

public class Main_18_2 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);

        LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        System.out.println(localTime);

        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime);
    }
}
