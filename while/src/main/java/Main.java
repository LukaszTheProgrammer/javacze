public class Main {

    public static void main(String[] args) {
        int licznik = -1;

        while (licznik < 0) { //wykonuj blok ( linie 7,8 ) dopóki warunek jest prawdziwy
            System.out.println("Hello: " + licznik);
            licznik = licznik - 1; //licznik--;
            //licznik = licznik +1 == licznik++
        }
    }
}
