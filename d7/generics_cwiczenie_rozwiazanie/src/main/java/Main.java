class Pojemnik <T> { //Deklarujemy że symbol T jest zmienną generyczną która będzie podana w
    //momencie definicji obiektów Pojemnik
    T zawartosc;

    public Pojemnik(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public T getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    @Override
    public String toString() {
        return String.format("Pojemnik {zawartosc='%s'}", zawartosc.toString()); //zawartosc.toString() możliwe ponieważ
        //wszystkie obiekty w Javie dziedziczą po Object a więc każdy typ który będzie podstawiony pod T w momencie wywołania
        //również będzie
    }
}


public class Main {

    public static void main(String[] args) {
        Pojemnik<String> p1 = new Pojemnik<>("Jakiś napis"); //Tworzymy Pojemnik String'ów
        Pojemnik<Double> p2 = new Pojemnik<>(234.40330); //Tworzymy Pojemnik Double'i
        Pojemnik<Long> p3 = new Pojemnik<>(123032332032L); //Tworzymy Pojemnik Long'ów

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
