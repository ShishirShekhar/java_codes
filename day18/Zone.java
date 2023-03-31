import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
    public static void ZonedTimeAndDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String fCurrDate = date.format(f1);
        System.out.println("formatted current Date and Time: " + fCurrDate);

        ZonedDateTime currZone = ZonedDateTime.now();
        System.out.println("the current zone is " + currZone.getZone());

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currZone.withZoneSameInstant(tokyo);
        System.out.println("Tokyo time zone is " + tokyoZone);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fDateTime = tokyoZone.format(f2);
        System.out.println("formatted tokyo Date and Time: " + fDateTime);
    }

    public static void main(String[] args) {
        ZonedTimeAndDate();
    }
}
