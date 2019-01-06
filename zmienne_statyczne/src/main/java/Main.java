class Demo {

    static int licznik = 0;
    int x = 0;

    Demo() {
        licznik++; //inkrementacja zmiennej statycznej
        x++; //inkrementacja pola klasy
    }
}

public class Main {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        System.out.println(d1.x); //0
        System.out.println(d1.licznik); //3 ponieważ licznik jest zmienną należącą do klasy Demo niejawnie i tak odwołujemy się
        //do globalnie dostępnej zminnej Demo.licznik nawet jeśli odnosimy się poprzez obiekt danej klasy
        //dlatego po wywołaniu każdego z 3 konstruktorów z linii 15,16,17 wartości licznika będą się akumulować
        //w przeciwieństie do x'a który jest osobny per każdy z obiektów
        System.out.println(d2.x); //0
        System.out.println(d2.licznik); //3
        System.out.println(d3.x);
        System.out.println(d3.licznik); //3
    }
}
