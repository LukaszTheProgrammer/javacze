import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Klasa Osoba musi implementować interfejs Comparable aby można było
//wstawiać do TreeSet
class Osoba implements Comparable<Osoba> {

    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        //return imie + " - " + nazwisko;
        return String.format("%s - %s", imie, nazwisko);
    }

    @Override
    public int compareTo(Osoba o) {
        //compareTo ze Stringa zwraca liczbę > 0 kiedy lewa strona jest alfabetycznie
        //wczesniej niż prawa, 0 jeśli napisy są == i liczbę < 0 jeśli prawa
        //strona jest alfabetycznie później niż lewa
        int nazwiskoCompare = this.nazwisko.compareTo(o.nazwisko);
        if (nazwiskoCompare == 0) {
            return this.imie.compareTo(o.imie); //jeśli nazwiska są == porównujemy po
            //imionach
        } else {
            return nazwiskoCompare; //w przeciwnym razie zwracamy wartość porównania po
            //nazwiskach
        }
    }

    //metoda equals i hashcode musi być przeciążona aby można było
    //porównywać elementy logicznie w HashSecie. Inaczej dla wywołania
    //metody contains moglibyśmy dostać false.
    //metody te są używane m.in przez HashSet do określenia równości
    //pomiedzy elementami zbioru
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Osoba osoba = (Osoba) o;

        if (!imie.equals(osoba.imie)) {
            return false;
        }
        return nazwisko.equals(osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + nazwisko.hashCode();
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        Set<Osoba> osoby = new TreeSet<>();
        Osoba o1 = new Osoba("Roman", "Polanski");
        osoby.add(new Osoba("Jan", "Kowalski"));
        osoby.add(new Osoba("Joe", "Doe"));
        osoby.add(o1);

        for (Osoba o : osoby) {
            System.out.println(o);
        }

        Set<Osoba> osoby2 = new HashSet<>();
        osoby2.add(new Osoba("Jan", "Kowalski"));
        osoby2.add(new Osoba("Joe", "Doe"));
        osoby2.add(o1);
        System.out.println("");
        System.out.println(osoby2.contains(new Osoba("Jan", "Kowalski")));
        System.out.println(osoby2.contains(o1));
    }
}
