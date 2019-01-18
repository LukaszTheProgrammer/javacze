class Pojemnik<T> {

    T zawartosc;

    public Pojemnik(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public T getZawartosc() {
        return zawartosc;
    }

    @Override
    public String toString() {
        return "Pojemnik{" +
            "zawartosc=" + zawartosc +
            '}';
    }
}

public class Main {

    public static void main(String[] args) {
        Pojemnik<Integer> pojemnikIntegerow = new Pojemnik<>(11);
        Pojemnik<String> pojemnikNapisow = new Pojemnik<>("Jakiś napis");
        System.out.println(pojemnikIntegerow);
        System.out.println(pojemnikNapisow);
    }
}
