import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>();
        imiona.add("Ala");
        imiona.add("Aga");
        imiona.add("Ada");
        imiona.add("Ania");

        wypisz(imiona);

        System.out.println("Czy lista zawiera imię Ala: "+imiona.contains("Ala"));
        System.out.println("Czy lista zawiera imię Roman: "+imiona.contains("Roman"));

        imiona.remove("Ala");

        wypisz(imiona);

        System.out.println("Pierwszy elementem jest: "+imiona.get(0));

        List<String> imiona2 = Arrays.asList("Lidia", "Ela");
        imiona.addAll(imiona2);

        wypisz(imiona);

        List<Integer> liczby = new LinkedList<>();

        System.out.println("Czy lista liczby jest pusta: "+liczby.isEmpty());
    }

    private static void wypisz(List<String> imiona) {
        System.out.println("");
        System.out.println("Podana lista zawiera: "+imiona.size()+" elementów");
        for(String imie : imiona){
            System.out.println(imie);
        }
        System.out.println("");
    }
}
