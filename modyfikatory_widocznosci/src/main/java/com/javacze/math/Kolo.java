package com.javacze.math;

//słowo kluczowe public przed nazwą klasy oznacza, że z klasy Kolo mogą korzystać klasy z innych pakietów
//tak jak robi to Main z pakietu com.javacze.
public class Kolo {

    private Punkt srodek;

    public Kolo(int x, int y) {
        this.srodek = new Punkt(x, y);
    }

    @Override
    public String toString() {
        return "Kolo{" +
            "srodek=" + srodek +
            '}';
    }
}
