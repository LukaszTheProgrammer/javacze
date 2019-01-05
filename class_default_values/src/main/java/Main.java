class Auto{
    int predkosc; // 0 by default
    double przyspieszenie; // 0.0 by default
    double pojemnosc; // 0.0  by default
}

class Dummy {
    boolean b; // false by default
    char c; // 0x0000 by default
    String s; // null by default
    Punkt p; // null by default
    double d; // 0.0 by default
}

class Punkt {
    int x; // 0 by default
    int y; // 0 by default
}

public class Main {

    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.predkosc = 256;
        bmw.przyspieszenie=5.0;
        bmw.pojemnosc = 2.0;

        Auto mercedes = new Auto();
        mercedes.predkosc = 300;
        mercedes.przyspieszenie = 5.5;
        mercedes.pojemnosc= 2.5;

        System.out.println(bmw.predkosc);
        System.out.println(bmw.przyspieszenie);
        System.out.println(bmw.pojemnosc);

        System.out.println(mercedes.predkosc);
        System.out.println(mercedes.przyspieszenie);
        System.out.println(mercedes.pojemnosc);

        Punkt p = new Punkt();
        p.x=15;
        System.out.println(p.x);
        System.out.println(p.y);

        Dummy dummy = new Dummy(); //tworzymy obiekt typu Dummy
        //który posiada 5 pól, żadnemu z pól nie nadaliśmy wartości
        //dlatego w poniższych liniach zobaczymy wartości domyślne zależne od typu zmiennych
        System.out.println(dummy.b);
        System.out.println(dummy.c);
        System.out.println(dummy.s);
        System.out.println(dummy.d);
        System.out.println(dummy.p);

        Dummy d2; // Deklaracja obiektu dummy - nic nie tworzymy - wartość d2 jest null
    }
}