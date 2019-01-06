package com.javacze;

import com.javacze.ludzie.Osoba;

public class Main {

    public static void main(String[] args) {
        Osoba o = new Osoba("Jan", "Kowalski"); //wywołanie konstruktora 2 argumentowego z klasy osoba

        System.out.println(o.getImie());
        System.out.println(o.getNazwisko());
    }
}