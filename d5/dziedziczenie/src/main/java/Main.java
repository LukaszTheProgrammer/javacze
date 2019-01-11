class Osoba {

    private String imie;
    private String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    String getImie() {
        return imie;
    }

    String getNazwisko() {
        return nazwisko;
    }
}

class Pracownik extends Osoba {

    private long idPracownika;
    private String[] uprawnienia;

    Pracownik(String imie, String nazwisko, long idPracownika, String[] uprawnienia) {
        super(imie, nazwisko);
        this.idPracownika = idPracownika;
        this.uprawnienia = uprawnienia;
    }

    public long getIdPracownika() {
        return idPracownika;
    }

    public String[] getUprawnienia() {
        return uprawnienia;
    }
}

class Klient extends Osoba {

    private double znizka;

    Klient(String imie, String nazwisko, double znizka) {
        super(imie, nazwisko);
        this.znizka = znizka;
    }

    public double getZnizka() {
        return znizka;
    }
}

public class Main {

    public static void main(String[] args) {
        Pracownik p = new Pracownik("Jim", "Beam", 123L, new String[]{"ADMINISTRATOR"});
        Klient k = new Klient("John", "Smith", 20.45);

        System.out.println(p.getImie());
        System.out.println(p.getNazwisko());

        System.out.println(k.getImie());
        System.out.println(k.getNazwisko());
    }
}
