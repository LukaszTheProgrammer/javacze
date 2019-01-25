public class Main {

    public static void main(String[] args) {
        System.out.println(suma(5));
        System.out.println(suma(10));
    }

    private static int suma(int i) {
        if (i > 0) {
            return i + suma(i - 1);
        } else {
            return i;
        }
    }
}
