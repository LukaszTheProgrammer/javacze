class Osoba {

    private String imie;
    private String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie='" + imie + '\''
            + ", nazwisko='" + nazwisko + '\''
            + '}';
    }
}

public class Main {

    public static void main(String[] args) {
        String[] uzytkownicy = new String[]{"Jan", "Aga", "Zenon", "Maria"}; //definicja tablicy napisów o rozmiarze 4
        // każda tablica ma zmienną mówiącą o jej rozmiarze
        for (int i = 0; i < uzytkownicy.length; ++i) { //iterujemy od przodu po tablicy uzytkownicy
            // przyklad odnoszenia sie do poszczegolnych elementów System.out.println(uzytkownicy[i]);
            System.out.println(uzytkownicy[i]);
        }
        System.out.println("");

        for (int i = uzytkownicy.length - 1; i >= 0; --i) { //iterujemy od tyłu po tablicy uzytkownicy
            System.out.println(uzytkownicy[i]);
        }
        System.out.println("");

        int[] liczby = new int[]{1, 2, 45, 67, 80, 34, 90, 23}; //definicja tablicy liczb całkowitych o rozmiarze 8
        for (int i = 0; i < liczby.length; ++i) {
            System.out.println(liczby[i]);
        }

        boolean[] bools = new boolean[]{true, false, false}; //definicja tablicy wartości logicznych o rozmiarze 3
        for (int i = 0; i < bools.length; ++i) {
            System.out.println(bools[i]);
        }
        System.out.println("");

        //definicja tablicy obiektów Osoba o rozmiarze 2
        Osoba[] ludzie = new Osoba[]{new Osoba("Jan", "Kowalski"), new Osoba("Tomek", "Nowak")};
        for (int i = 0; i < ludzie.length; ++i) {
            System.out.println(ludzie[i]);
        }
    }
}