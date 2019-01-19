public class Main {

    public static void main(String[] args) {
        System.out.println(silnia(4));
    }

    private static int silnia(int i) {
        if(i > 0){
            return i * silnia(i-1);
        } else {
            if(i < 0){
                throw new IllegalArgumentException("Ujemne wartości niedozwolone dla funkcji silnia");
            }
            return 1;
        }
    }
}
