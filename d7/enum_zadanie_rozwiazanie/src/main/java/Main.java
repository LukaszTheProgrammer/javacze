import java.util.Scanner;

enum Zwierzeta {
    CAT("Kot"), DOG("Pies"), TURTLE("Żółw"), PARROT("Papuga"), HORSE("Koń");

    private final String polskaNazwa;

    Zwierzeta(String polskaNazwa) {
        this.polskaNazwa = polskaNazwa;
    }

    public String getPolskaNazwa() {
        return polskaNazwa;
    }
}

class UnknownAnimalException extends RuntimeException {

    public UnknownAnimalException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine()
                .toUpperCase(); //Czytamy linię od użytkownika z klawiatury i konwertujemy ją do dużych liter
            try {
                Zwierzeta zwierze = Zwierzeta.valueOf(input); //Mapujemy z napisu od użytkownika do enuma Zwierzeta
                System.out.println(zwierze.name() + " " + zwierze.getPolskaNazwa());
            } catch (IllegalArgumentException ex) {
                //Jeśli podany napis nie jest jedną z wartości CAT, DOG, TURTLE, PARROT, HORSE w linii 33 poleci wyjątek IllegalArgumentException
                //W tym bloku łapiemy go i przerzucamy jako UnknownAnimalException
                throw new UnknownAnimalException("Niepopoprawne zwierzę");
            }
        }
    }
}
