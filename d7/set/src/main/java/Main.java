import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> imiona = new HashSet<>();
        imiona.add("Marek");
        imiona.add("Darek");
        imiona.add("Jarek");
        imiona.add("Marek");

        wypisz(imiona);

        System.out.println("\nCzy zbiór zawiera imię Ala: " + imiona.contains("Ala"));
        System.out.println("\nCzy zbiór zawiera imię Marek: " + imiona.contains("Marek"));

        imiona.remove("Marek");

        wypisz(imiona);

        List<String> imiona2 = Arrays.asList("Jan", "Wiesiek", "Dzidek", "Jan", "Jarek");
        wypisz(imiona2);
        imiona.addAll(imiona2);
        wypisz(imiona);

//        Set<Integer> liczby = Set.of(1,2,3,4);
    }

    private static void wypisz(Collection<String> imiona) {
        System.out.println("\nRozmiar wynosi:" + imiona.size());

        for (String imie : imiona) {
            System.out.println(imie);
        }
    }
}
