import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader classLoader = Main.class.getClassLoader();
        //classLoader pozwala na pobranie względnej ścieżki pliku bez konieczności podawania jej całej dzięki
        //metodzie getResource, alternatywnie zamiast tworzyć obiekt classLoader'a i wywoływać getResource
        //moglibyśmy podać całą ścieżkę do pliku np.: C:\\temp\\plik.txt
        File plik = new File(classLoader.getResource("zarobki.txt").getFile());
        Scanner scanner = new Scanner(plik); //tworzymy obiekt scanner'a ze źródłem ustawionym na plik

        while(scanner.hasNext()){  // zwraca true jeśli w buforze danych znajdują się dane
            String line = scanner.nextLine();
            line = line.replaceAll("[\\d,]+", "***"); //pattern należy czytać jako dowolna cyfra lub , występujący conajmniej raz
            System.out.println(line);
        }
    }
}
