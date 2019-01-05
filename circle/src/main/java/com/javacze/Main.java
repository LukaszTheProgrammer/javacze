package com.javacze;

// ponieważ klasa Circle i point są zadeklarowany w innym pakiecie niż klasa Main która ich używa musimy dodać deklaracje
import com.javacze.shapes.Circle;
import com.javacze.shapes.Point;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(3,4); // tworzymy obiekt klasy Point przez wywołanie konstruktora 2-wu argumentowego
        Circle c = new Circle(p); // tworzymy obiekt klasy Circle przez wywołanie konstruktora 1-dno argumentowego

        System.out.println(c.getCenter());// getCenter() na obiekcie klasy Circle zwróci punkt którego zawartość zostanie wypisana na ekranie.
        //w tym przypadku klasa Punkt ma przeciążoną metodę toString dlatego na ekranie powiniśmy zobaczyć dane x i y.
    }
}