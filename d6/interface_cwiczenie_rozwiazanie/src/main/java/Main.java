interface Kształt {

    double pole();
}

// Kwadrat a * a
// Prostokąt a * b
// Koło PI * r^2
// Math.PI

class Kwadrat implements Kształt {

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double pole() {
        return bok * bok;
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
        return bokA * bokB;
    }
}

class Koło implements Kształt {
    private double promień;

    public Koło(double promień) {
        this.promień = promień;
    }

    @Override
    public double pole() {
        return Math.PI * promień * promień;
    }
}

public class Main {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(15.0);
        Prostokąt prostokąt = new Prostokąt(10, 20);
        Koło koło = new Koło(8.5);

        wypisz(kwadrat);
        wypisz(prostokąt);
        wypisz(koło);
    }


    public static void wypisz(Kształt kształt) {
        System.out.println(kształt.pole());
    }
}
