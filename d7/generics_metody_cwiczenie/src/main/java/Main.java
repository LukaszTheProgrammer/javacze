public class Main {

    public static void main(String[] args) {
        Integer [] ints = new Integer[] {1,2,3,4,5};
        String [] imiona = new String[] {"Ala", "Aga", "Ada"};
        wypisz(ints); //Nie trzeba jawnie podawać typu generycznego ponieważ będzie on wyłapany z kontekstu,
        //w miejsce T zostanie podstawiony Integer
        wypisz(imiona);
    }

    private static <T> void wypisz(T[] tablica) { //metoda wypisz jest metodą z 1 parametrem generycznym <T>
        System.out.println("\nZawartość tablicy to:");
        for(T i : tablica){
            System.out.println(i);
        }
    }
}
