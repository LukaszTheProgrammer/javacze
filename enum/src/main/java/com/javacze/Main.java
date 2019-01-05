package com.javacze;

enum Compass {
    NORTH("N"), SOUTH("S"), WEST("W"), EAST("E");

    Compass(String symbol) {
        this.symbol = symbol;
    }

    private String symbol;

    public String getSymbol() {
        return symbol;
    }
}

public class Main {

    public static void main(String[] args) {
        Compass direction = Compass.SOUTH;

        Compass direction2 = Compass.valueOf("NORTH");

        System.out.println(direction);
        System.out.println(direction2);

        System.out.println("\n");

        for (Compass d : Compass.values()) {
            System.out.println(d + " " + d.getSymbol());
        }
    }

}