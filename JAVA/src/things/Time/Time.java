package things.Time;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class currentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
class currentDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}
class currentDateAndTime {
    public static void main(String[] args) {
        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss");
        DateTimeFormatter Every = DateTimeFormatter.ofPattern("h:m:s, a");

        String formattedDateTime = DateTime.format(Format);
        String formattedEvery = DateTime.format(Every);

        System.out.println(formattedDateTime);
        System.out.println(formattedEvery);
    }
}