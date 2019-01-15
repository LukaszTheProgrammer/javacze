abstract class Pojazd { //Nie mozna utworzyc instancji klasy Pojazd ponieważ jest ona abstrakcyjna

    protected double wpolczynnikHamowania = 20;
    protected double predkosc;

    abstract void przyspiesz(); //deklaracja metody abstrakcyjnej

    abstract void hamuj(); //deklaracja metody abstrakcyjnej

    public double getPredkosc() {
        return predkosc;
    }
}

class Rower extends Pojazd { //klasa Rower rozszerza klasę Pojazd wobec czego odziedziczy pola predkosc oraz metodę getPredkosc
    //poza tym musi zaimplementowac metody abstrakcyjne z klasy Pojazd

    private static final double topSpeed = 50;
    private double wspolczynnikHamowania = 10;

    @Override
    public void przyspiesz() { //implementacja metody przyspiesz
        if (predkosc < topSpeed) {
            predkosc += 5;
        }
    }

    @Override
    void hamuj() { //implementacja metody hamuj
        if (predkosc > 0) {
            predkosc -= wspolczynnikHamowania;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Pojazd p = new Rower();
        p.przyspiesz();
        p.przyspiesz();
        System.out.println(p.getPredkosc());
    }
}
