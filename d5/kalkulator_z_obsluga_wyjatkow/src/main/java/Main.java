import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wprowadź wyrażenie do obliczenia:");
                int a = Integer.parseInt(scanner.next());
                String operacja = scanner.next();
                int b = Integer.parseInt(scanner.next());
                System.out.println("= " + wykonaj(a, operacja, b));
            } catch (IllegalArgumentException ex) {
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
