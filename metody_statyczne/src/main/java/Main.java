public class Main {

    public static void main(String[] args) {
        int a = Matematyka.wartoscBezwzgledna(120); // wywołanie metody statycznej klasy Matematyka,
        // nie jest wymagany obiekt klasy Matymatyka, metody statyczne wołamy z nazwą klasy z której pochodzą
        int b = Matematyka.wartoscBezwzgledna(-300);//wywołanie metody statycznej
        int c = Matematyka.wartoscBezwzgledna(-500);//wywołanie metody statycznej

        System.out.println(a); // 120
        System.out.println(b); // 300
        System.out.println(c); // 500

        boolean nieparzysta = Matematyka.czyParzysta(123);//wywołanie metody statycznej
        boolean parzysta = Matematyka.czyParzysta(250);//wywołanie metody statycznej

        System.out.println(nieparzysta); // false
        System.out.println(parzysta);  // true

    }
}
