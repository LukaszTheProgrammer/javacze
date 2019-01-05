package com.javacze;

enum Compass {
    NORTH("N"), SOUTH("S"), WEST("W"), EAST("E"); // definicja 4 wartości w typie wyliczeniowym Enum

    private String symbol; //typy wyliczeniowe mogą posiadać pola tak jak klasy

    Compass(String symbol) {
        this.symbol = symbol;
    } //jak również konstruktory, ale są one prywatne w ramach danego typu wyliczeniowego i nie można
    // ich wywołać inaczej niż poprzez definicję wartości
    // (inaczej mówiąc wywołanie new Compass z dowolnego miejsca w kodzie jest niedozwolone,
    // konstruktor w tym przypadku wywoła się dla każdej z 4 zdefiniowach wartości)

    public String getSymbol() {
        return symbol;
    }
}

public class Main {

    public static void main(String[] args) {
        Compass direction = Compass.SOUTH; // ponieważ direction jest typu Compass, który jest typem
        //wyliczeniowym możemy go zainicjować jedynie jedną z 4 zdefiniowachy wartości.

        Compass direction2 = Compass.valueOf("NORTH"); //każdy typ wyliczeniowy posiada również metodę
        //valueOf która zwraca wartość wyliczeniową na podstawie podanego napisu. wartość napisu musi
        //odpowiadać jednej ze zdefiniowanych wartości z zachowaniem wielkości liter

        System.out.println(direction);
        System.out.println(direction2);

        System.out.println("\n");

        for (Compass d : Compass.values()) { //każdy typ wyliczeniowy posiada metodę values() zwracającą kolekcję wartości wyliczeniowych
            System.out.println(d + " " + d.getSymbol());
        }
    }
}