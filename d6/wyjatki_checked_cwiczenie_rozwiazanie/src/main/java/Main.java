class MathematicalException extends RuntimeException {

    public MathematicalException(String message) {
        super(message);
    }
}

class NumberException extends MathematicalException {

    public NumberException(String message) {
        super(message);
    }
}


public class Main {

    public static void main(String[] args) {
        try {
            pierwiastek(-12.00); // wywołujemy metodę pierwiastek z argumentem -12
        } catch (MathematicalException e) {
            System.out.println("Wystąpił wyjątek");
        }
    }

    public static double pierwiastek(double liczba) {
        if (liczba < 0.0) { // kiedy liczba mniejsza od 0.0
            throw new NumberException("Nie można pierwiastkować liczb ujemnych"); // przerwij wykonywanie zrzucając wyjątek
        }
        return Math.sqrt(liczba); //ta linia wykona się tylko jeśli liczba > 0.0
    }
}

