package com.javacze;


import com.javacze.math.Kolo;

public class Main {

    public static void main(String[] args) {
        //w pakiecie com.javacze.math są dwie klasy Kolo i Punkt.
        //tylko klasa Kolo jest publiczna dlatego można jej użyć z innego pakietu
        Kolo k = new Kolo(5, 6);

        //Punkt p = new Punkt(5,6); to wywołanie jest niepoprawne ponieważ klasa Punkt jest z domyślnym modyfikatorem
        //package-private, który oznacza że tylko klasy z tego samego pakietu mogą jej używać.
        System.out.println(k);
    }
}