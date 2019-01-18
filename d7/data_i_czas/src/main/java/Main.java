import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        //sposoby tworzenia dat
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018, Month.APRIL, 10);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(10, 20);
        LocalTime time3 = LocalTime.of(10, 20, 45);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2018, Month.APRIL, 12, 9, 45);
        LocalDateTime dateTime3 = LocalDateTime.of(2018, Month.APRIL, 1, 10, 30, 55);
        LocalDateTime dateTime4 = LocalDateTime.of(date1, time1);

        System.out.println("Tworzenie daty ze string'a");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String input = "12-12-2012 10:20";
        LocalDateTime date = LocalDateTime.parse(input, formatter);
        System.out.println(date);

        System.out.println("\nLocalDate");
        LocalDate nowPlus3Months = LocalDate.now().plusMonths(3);
        System.out.println(nowPlus3Months);
        System.out.println(nowPlus3Months.getDayOfMonth());
        System.out.println(nowPlus3Months.getDayOfWeek());
        System.out.println(nowPlus3Months.getDayOfYear());
        System.out.println(nowPlus3Months.getMonth());
        System.out.println(nowPlus3Months.getYear());

        System.out.println("\nLocalDateTime");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println(dateTime.getNano());
    }
}
