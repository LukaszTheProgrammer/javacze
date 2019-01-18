class Kolekcja{
    Integer [] liczby = new Integer[100];

    public Kolekcja(Integer ... liczby) {
        for(int i =0 ; i< liczby.length ; i++){
            this.liczby[i] = liczby[i];
        }
        this.liczby = liczby;
    }
}
public class Main {

    public static void main(String[] args) {
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
