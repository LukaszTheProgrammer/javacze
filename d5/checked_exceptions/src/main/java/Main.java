
class MyCheckedException extends Exception {

    MyCheckedException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Zaraz poleci wyjątek");
        try {
            validateArgumentLength(args);
        } catch (MyCheckedException e) {
            System.out.println("wystąpił wyjątek `" + e.getMessage()+"`");
        }
        System.out.println("Tej linii nikt nie zobaczy jeśli liczba argumentów programu < 100");
    }

    private static void validateArgumentLength(String[] args) throws MyCheckedException {
        if(args.length < 100 ) {
            throw  new MyCheckedException("Liczba argumentów jest mniejsza od 100");
        }
    }

}


