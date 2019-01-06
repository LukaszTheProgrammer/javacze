import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();//Zczytujemy znaki do momentu wystąpienia spacji a następnie przypisujemy
        //zawartość do zmiennej konwertując do typu int
        String operacja = scanner.next();//analogicznie jak powyżej tylko że nie następuje konwersja do int'a
        int operand2 = scanner.nextInt();//to samo co w linii 7

        if (operacja.equals("+")) {
            System.out.println(operand1 + operand2);
        } else if (operacja.equals("*")) {
            System.out.println(operand1 * operand2);
        } else {
            System.out.println("Nieobslugiwane polecenie!");
        }
    }
}