import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać wyrażenie do obliczenia:");

        int operand1 = scanner.nextInt(); //Zczytujemy znaki do momentu wystąpienia spacji a następnie przypisujemy
        //zawartość do zmiennej
        String operacja = scanner.next(); //analogicznie jak powyżej tylko że nie następuje konwersja do int'a
        int operand2 = scanner.nextInt(); //to samo co w linii 9

        switch (operacja) {
            case "+": // jeśli nasza operacja to + wykonają się linie 16,17,18
                int wynik = operand1 + operand2;
                System.out.println(wynik);
                break; // wyjście z bloku switch
            case "*": // jeśli nasza operacja to * wykonają się linie 20,21
                System.out.println(operand1 * operand2);
                break;
            default: // jeśli podano cokolwiek innego niż + cz * wykonają się linie 23,24
                System.out.println("Operacja nieobsługiwana");
                break;
        }
    }
}