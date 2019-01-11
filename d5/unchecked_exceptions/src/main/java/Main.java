class MyUncheckedException extends RuntimeException {

    MyUncheckedException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Zaraz poleci wyjątek");
        validateArgumentLength(args);
        System.out.println("Tej linii nikt nie zobaczy jeśli liczba argumentów programu < 100");
    }

    private static void validateArgumentLength(String[] args)  {
        if(args.length < 100 ) {
            throw new MyUncheckedException("Liczba argumentów jest mniejsza od 100");
        }
    }
}

