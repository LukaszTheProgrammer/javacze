import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wprowadź wyrażenie do obliczenia:");
                int a = Integer.parseInt(scanner.next()); //czytamy z klawiatury napis aż do wystąpienia spacji
                //a następnie ten napis jest konwertowany do Integera
                String operacja = scanner.next(); //czytamy napis aż do wystąpienia spacji
                int b = Integer.parseInt(scanner.next()); //podobnie jak w lini 11
                System.out.println("= " + wykonaj(a, operacja, b));//wywołujemy metodę wykonaj a wynik drukujemy na ekranie
            } catch (IllegalArgumentException ex) { //jeśli w powyższym bloku zostanie zrzucony wyjątek typu IllegalArgumentException
                //lub innego typu dziedziczącego po IllegalArgumentException zostanie on obsłużony poniżej
                //poprzez wydrukowanie treści jego wiadomości
                System.out.println(ex.getMessage());
            }
        }
    }

    private static int wykonaj(int a, String operacja, int b) {
        switch (operacja) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Nieobsługiwana operacja: " + operacja);
        }
    }
}
