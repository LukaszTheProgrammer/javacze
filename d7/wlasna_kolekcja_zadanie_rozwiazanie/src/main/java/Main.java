class Kolekcja <T> {

    Object [] liczby = new Object[100];
    int rozmiar = 0;

    public Kolekcja(T... liczby) {
        for (int i = 0; i < liczby.length; i++) {
            this.liczby[i] = liczby[i];
            rozmiar++;
        }
    }

    public void dodaj(T element) {
        liczby[rozmiar] = element;
        rozmiar++;
    }

    public int size() {
        return rozmiar;
    }

    public T pobierz(int index) {
        return (T) liczby[index];
    }
}

public class Main {

    public static void main(String[] args) {
        Kolekcja<Integer> k = new Kolekcja<>(1, 2);
        Kolekcja<String> kolekcjaNapisow = new Kolekcja<>("Ala", "Aga", "Tomek");
        // rozmiar k wynosi 2 i przechowuje 1,2
        k.dodaj(5);
        // rozmiar k wynosi 3 i przechowuje 1,2,5

        for (int i = 0; i < k.size(); ++i) {
            System.out.println(k.pobierz(i));
        }

        for (int i = 0; i < kolekcjaNapisow.size(); ++i) {
            System.out.println(kolekcjaNapisow.pobierz(i));
        }

        //Zdefiniuj dowolną klasę z 2 polami. Na przykład Osoba z imieniem i nazwiskoem.
        //Zdefiniuj klasę Kolekcja która będzie posiadała 1 pole będące listą 100 Osób lub innych typów które
        // wceśniej utworzyłeś/aś.
        //Stwórz konstruktor przyjmujący jako jedyny parametr dowolną ilość osób ( varargs )
        //Wpisz osoby do listy klasy Kolekcja.
        //W metodzie main stwórz obiekt klasy Kolekcja z 2 lub 3 obiektami klasy Osoba:
        //Kolekcja k = new Kolekcja(new Osoba("Jan", "Nowak"), new Osoba("Tomasz","Kruk"));
        //Dodaj do klasy Kolekcja metodę rozmiar która będzie drukować rozmiar kolekcji.
        //Następnie użyj na obiekcie klasy Kolekcja drukując jej rozmiar
        //Wypisz zawartość kolekcji na ekranie
        //Dodaj do klasy Kolekcja metodę "dodaj" która umożliwi dodawanie elementów do kolekcji
        //Użyj dodając kilka obiektów do kolekcji i wypisz ponownie zawartość
    }
}
