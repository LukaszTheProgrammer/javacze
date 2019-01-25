import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class Wydarzenie {

    private final String name;
    private final LocalDateTime dataWystąpienia;

    Wydarzenie(String name, LocalDateTime dataWystąpienia) {
        this.name = name;
        this.dataWystąpienia = dataWystąpienia;
    }

    Wydarzenie(String name, String s) {
        this.name = name;
        this.dataWystąpienia = konwertuj(s); //konwersja ze Stringa na LocalDateTime
    }

    private LocalDateTime konwertuj(String date) {
        //Tworzymy obiekt formatera dając mu oczekiwany format daty
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(date, formatter); //konwersja, date musi odpowiadać formatem
        //wzorcowi formatter'a inaczej dostaniemy wyjątek.
    }

    @Override
    public String toString() {
        return String.format("Wydarzenie{ nazwa = %s, data = %s}", name, dataWystąpienia);
    }

    Wydarzenie przesun(int i) {
        return new Wydarzenie(name, dataWystąpienia.plusDays(i));//tworzymy nowy obiekt wydarzenia
        //który jako datę wystąpienia będzie miał date obecnego wydarzenia przesuniętą o "i" dni
    }

    String formatujDateWydarzenia(){
        // Wtorek 20 Marca 2018 10:20
        SimpleDateFormat format = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm");
        //Instant to jest data w strefie UTC.
        Date date = Date.from(dataWystąpienia.toInstant(ZoneOffset.ofHours(1)));
        return format.format(date);
    }
}

public class Main {

    public static void main(String[] args) {
        Wydarzenie w1 = new Wydarzenie("Java kurs dzień 8", LocalDateTime.now());
        Wydarzenie w2 = new Wydarzenie("Walentynki", "2019-02-14 10:00");

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1.przesun(4));
        System.out.println(w2.formatujDateWydarzenia());
    }
}
