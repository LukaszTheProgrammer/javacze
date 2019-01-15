abstract class Pojazd {

    protected double wpolczynnikHamowania = 20;
    protected double predkosc;

    abstract void przyspiesz();

    abstract void hamuj();

    public double getPredkosc() {
        return predkosc;
    }
}

class Rower extends Pojazd {

    private static final double topSpeed = 50;
    private double wspolczynnikHamowania = 10;

    @Override
    public void przyspiesz() {
        if (predkosc < topSpeed) {
            predkosc += 5;
        }
    }

    @Override
    void hamuj() {
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
