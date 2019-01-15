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

class Pracownik extends Osoba { //Pracownik dziedziczy po klasie Osoba pola imie, nazwisko
    //oraz metody getImie, getNazwisko

    private long idPracownika; //to jest pole własne klasy Pracownik
    private String[] uprawnienia;//to jest pole własne klasy Pracownik

    Pracownik(String imie, String nazwisko, long idPracownika, String[] uprawnienia) {
        super(imie, nazwisko); //wywołujemy konstruktor klasy Osoba poprzez słowo kluczowe super
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

        System.out.println(p.getImie()); //możliwe ponieważ Pracownik dziedziczy po Osobie
        System.out.println(p.getNazwisko());//możliwe ponieważ Pracownik dziedziczy po Osobie

        System.out.println(k.getImie());//możliwe ponieważ Klient dziedziczy po Osobie
        System.out.println(k.getNazwisko());//możliwe ponieważ Klient dziedziczy po Osobie
    }
}
