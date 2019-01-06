package com.javacze.math;

//brak modyfikatora widoczności przed klasą Punkt oznacza że klasa jest dostępna tylko w ramach pakietu
//nadany jest tak zwany domyślny modyfikator dostępu zwany package-private
class Punkt {
    private int x;
    private int y;

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }
}