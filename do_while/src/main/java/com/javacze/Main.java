package com.javacze;

public class Main {

    public static void main(String[] args) {
        int licznik = -1;

        do { // wykonaj co następuje
            System.out.println("Odliczamy: " + licznik);
            licznik = licznik - 1; //licznik--;
        } while (licznik > 0); //dopóki warunek licznik > 0 jest prawdziwy.
        // Ponieważ licznik wynosi -1 warunek nie jest spełniony już po pierwszym przebiegu. Pętla wykona się tylko raz

        System.out.println("\n\n");

        licznik = 10;

        do {
            System.out.println("Drugie odliczanie: " + licznik);
            licznik = licznik - 1; //licznik--;
        } while (licznik > 0); // w tym wypadku pętla wykona się 10x ponieważ wartość licznika wynosi 10 i musi zostać
        // zdekrementowany 10x zanim warunek przestanie być spełnony
    }
}