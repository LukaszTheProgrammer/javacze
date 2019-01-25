import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> imiona = Arrays.asList("Ala", "Aga", "Tomek", "Romek");

        imiona.forEach((String element) -> System.out.println(element.length()));
        System.out.println("");
        imiona.forEach(System.out::println);
        System.out.println("");
        imiona.forEach(Main::metoda);

        List<Integer> liczby = Arrays.asList(1, 2, 3, 4);

        System.out.println("");
        liczby.forEach((Integer element) -> System.out.println(element));

        List<String> imionaZenskie = new ArrayList<>();
        for (String imie : imiona) {
            if (imie.endsWith("a")) {
                imionaZenskie.add(imie);
            }
        }
        System.out.println("");
        imionaZenskie.forEach(System.out::println);

        imiona.stream()
            .filter(element -> element.endsWith("a"))
            .forEach(System.out::println);

        imiona.stream()
            .map(element -> element.length())
            .forEach(System.out::println);

        System.out.println("");
        List<String> firmy = Arrays.asList("Trw", "LG", "Apple", "Toshiba", "S4");

        firmy.stream()
            .filter(firma -> firma.length() >= 3) // Trw, Apple, Toshiba
            .map(firma -> firma.toUpperCase()) // TRW, APPLE, TOSHIBA
            .map(firma -> firma.substring(0,3))// TRW, APP, TOS
            .forEach(System.out::println);

        System.out.println("");
        Arrays.asList("Trw, Lg,Apple", "Toshiba", "Porche, Vw, Audi").stream()
            .map(element -> element.split(",")) //
            .flatMap((String [] element) -> Arrays.stream(element))
            .map(element -> element.trim())
            .forEach(System.out::println);

    }

    private static void metoda(String element) {
        System.out.println(element);
    }
}
