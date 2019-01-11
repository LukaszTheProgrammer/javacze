interface Pojazd {

    void hamuj();

    void przyspiesz();

    int obecnaPredkosc();

    String nazwaPojazdu();
}

class Bmw implements Pojazd {

    private final static int topSpeed = 250;
    private final static int wspolczynnikPrzyspieszenia = 40;
    private final static int wspolczynnikHamowania = 25;

    private int predkosc;

    @Override
    public void hamuj() {
        if (predkosc > 0) {
            predkosc -= wspolczynnikHamowania;
        }
    }

    @Override
    public void przyspiesz() {
        if (predkosc < topSpeed) {
            predkosc += wspolczynnikPrzyspieszenia;
        }
    }

    @Override
    public int obecnaPredkosc() {
        return predkosc;
    }

    @Override
    public String nazwaPojazdu() {
        return "Bmw";
    }
}

class Opel implements Pojazd {

    private final static int topSpeed = 220;
    private final static int wspolczynnikPrzyspieszenia = 30;
    private final static int wspolczynnikHamowania = 15;

    private int predkosc;

    @Override
    public void hamuj() {
        if (predkosc > 0) {
            predkosc -= wspolczynnikHamowania;
        }
    }

    @Override
    public void przyspiesz() {
        if (predkosc < topSpeed) {
            predkosc += wspolczynnikPrzyspieszenia;
        }
    }

    @Override
    public int obecnaPredkosc() {
        return predkosc;
    }

    @Override
    public String nazwaPojazdu() {
        return "Opel";
    }
}

public class Main {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Opel opel = new Opel();

        symuluj(bmw);
        symuluj(opel);
    }

    private static void symuluj(Pojazd pojazd) {
        pojazd.przyspiesz();
        pojazd.przyspiesz();
        pojazd.przyspiesz();
        pojazd.hamuj();
        pojazd.hamuj();
        pojazd.przyspiesz();
        System.out.println(pojazd.nazwaPojazdu() + " jedzie z predkoscia " + pojazd.obecnaPredkosc() + " km\\h");
    }
}
