public class Main {

    public static void main(String[] args) {
        Integer [] ints = new Integer[] { 1,2,3,4,5};
        Double [] doubles = new Double[] { 12.3, 93.5, 97.44, 56.29};
        wypisz(ints);
        wypisz(doubles);
    }

    private static <T> void wypisz(T[] tablica) {
        for(T t: tablica){
            System.out.println(t);
        }

        System.out.println("");
    }
}
