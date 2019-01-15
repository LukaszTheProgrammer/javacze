class Zwierze {

    private String imie;

    public Zwierze(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void dajGlos() {
        System.out.println("");
    }

}

class Kot extends Zwierze {

    Kot(String imie) {
        super(imie);
    }

    public void dajGlos() {
        System.out.println("Miau!");
    }

    public void nawoluj() {
        System.out.println("kici kici");
    }


}

class Pies extends Zwierze {

    Pies(String imie) {
        super(imie);
    }

    @Override
    public void dajGlos() {
        System.out.println("Hau!");
    }

    @Override
    public String toString() {
        return "Pies = "+getImie();
    }
}

public class Main {

    public static void main(String[] args) {
        // Napisz tablicę 5 zwierząt
        // Wpisz losowo na poszczególne elementy psy i koty
        // zdefiniuj metodę pomocniczą, która dostanie
        // tablicę zwierząt a następnie na pętli wywoła dla każdego elemetu
        // metodę getImię i metodę dajGłos()

        Object o = new Object();

        Object p = new Pies("PP");

        System.out.println(p.toString());

        Zwierze[] zwierzeta = new Zwierze[5]; //deklarujemy tablicę 5 zwierząt
        zwierzeta[0] = new Pies("Azor"); // wpisujemy pod indeks 0 Psa
        zwierzeta[1] = new Pies("Burek"); //wpisujemy pod indeks 1 Psa
        zwierzeta[2] = new Pies("Rex");
        zwierzeta[3] = new Kot("Filemon");
        zwierzeta[4] = new Kot("Luna");

        //Zwierze [] zwierzeta = new Zwierze[] { new Pies("Rex"), new Kot("Mruczek") }

        metoda(zwierzeta); //wywołujemy metodę "metoda" przekazując jej
        //jako parametr tablicę zwierząt o nazwie zwierzeta
    }


    private static void metoda(Zwierze[] zwierzeta) {
        for (Zwierze zwierze : zwierzeta) { //dla każdego zwierzaka z tablicy zwierzeta
            //wykonaj co nastepuje
            System.out.println(zwierze.getImie()); // wypisz imie zwierzaka
            zwierze.dajGlos(); //wywolaj dajGlos na zwierzaku
        }
    }
}
