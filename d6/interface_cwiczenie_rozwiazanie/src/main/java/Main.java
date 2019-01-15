interface Kształt {

    double pole(); //metoda abstrakcyjna nie posiadająca implementacji
}

// Kwadrat a * a
// Prostokąt a * b
// Koło PI * r^2
// Math.PI

class Kwadrat implements Kształt { //Kwadrat implementuje Kształt wobec czego musi zdefiniować implementacje
    //metody pole z interfejsu Kształt

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double pole() {
        return bok * bok; //implementacja metody pole właściwa dla Kwadratu
    }
}

class Prostokąt implements Kształt {

    private double bokA;
    private double bokB;

    public Prostokąt(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double pole() {
        return bokA * bokB; //implementacja metody pole właściwa dla Prostokąta
    }
}

class Koło implements Kształt {
    private double promień;

    public Koło(double promień) {
        this.promień = promień;
    }

    @Override
    public double pole() {
        return Math.PI * promień * promień; //implementacja metody pole właściwa dla Koła
    }
}

public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(15.0);
        Prostokąt prostokąt = new Prostokąt(10, 20);
        Koło koło = new Koło(8.5);

        wypisz(kwadrat); //Mamy tylko jedną metodę wypisz która przyjmuje argument typu Kształt
        //natomiast wywołujemy ją z implementacjami Kwadrat, Prostokąt i Koło
        //jest to możliwe dzięki mechanizmowi polimorfizmu
        //który pozwala na wskazywanie zmiennym typu bazowego na obiekty typów pochodnych
        wypisz(prostokąt);
        wypisz(koło);
    }


    public static void wypisz(Kształt kształt) {
        System.out.println(kształt.pole()); //Kształt to interfejs nie posiadający implementacji metody pole
        //woboc czego właściwa implementacja zostanie wybrana na podstawie przekazanego obiektu
    }
}
