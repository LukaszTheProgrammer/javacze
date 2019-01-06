import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //tworząc obiekt scanner'a ze źródłem ustawionym na "klawiaturę"
        String polecenie = scanner.nextLine(); //program blokuje się i oczekuje na input z klawiatury
        //w momencie wciśnięcia enter'a program wznawia wykonywanie przypisując znaki wprowadzone z klawiatury
        // do zmiennej polecenie

        if (polecenie.equals("czas")) { //porównujemy z uwzględnieniem wielkości liter
            System.out.println(new Date());
        } else if (polecenie.equals("newLine")) {
            System.out.println("");
        } else if (polecenie.equals("liczbaLosowa")) {
            long seed = new Date().getTime();
            int x = new Random(seed).nextInt();
            System.out.println(x);
        } else {
            System.out.println("Nieobslugiwane polecenie!");
        }
    }
}