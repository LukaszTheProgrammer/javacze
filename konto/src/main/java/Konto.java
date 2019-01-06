class Osoba {
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Osoba{");
        sb.append("imie='").append(imie).append('\'');
        sb.append(", nazwisko='").append(nazwisko).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

public class Konto {
    double saldo;
    Osoba posiadacz;
    double odsetki;

    public Konto(double saldo, Osoba posiadacz, double odsetki) {
        this.saldo = saldo;
        this.posiadacz = posiadacz;
        this.odsetki = odsetki;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Konto{");
        sb.append("saldo=").append(saldo);
        sb.append(", posiadacz=").append(posiadacz);
        sb.append(", odsetki=").append(odsetki);
        sb.append('}');
        return sb.toString();
    }
}