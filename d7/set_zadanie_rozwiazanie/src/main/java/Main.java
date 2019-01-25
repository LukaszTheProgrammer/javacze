import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> imiona = new HashSet<>(); //Tworzymy obiekt HashSet i przypisujemy referencje

        // do zmiennej imiona ( Polimorfizm: referencja typu Set<String> wskazuje na HashSet<String>)
        while (true) {
            System.out.println("Podaj imię:");

            String imie = scanner.nextLine(); //Pobieramy nową linię od użytkownika i przypisujemy
            // do zmiennej imię
            if (imie.equals("-")) { //jeśli imię == "-" kończymy pętle for
                break;
            }

            imiona.add(imie); //dodajemy imię do zbioru imiona
        }

        for (String imie : imiona) {
            System.out.println(imie); //wyświetlamy zawartość na ekranie
        }
    }
}
