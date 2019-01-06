public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Tomek", "Nowak");
        Konto eKonto = new Konto(1500.00, osoba, 1.5);

        System.out.println(eKonto);
    }
}