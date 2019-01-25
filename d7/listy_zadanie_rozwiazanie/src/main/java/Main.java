import java.util.ArrayList;
import java.util.List;

interface Zwierze {

    void dajGlos();
}

class Papuga implements Zwierze {

    @Override
    public void dajGlos() { //implementacja dajGlos z interfejsu Zwierze
        System.out.println("RRRRRaaaaaaa!");
    }
}

class Zolw implements Zwierze {

    @Override
    public void dajGlos() { //implementacja dajGlos z interfejsu Zwierze
        System.out.println("yyy!");
    }
}


public class Main {

    public static void main(String[] args) {
        Papuga papuga = new Papuga();
        Zolw zolw = new Zolw();
        List<Zwierze> zwierzeta = new ArrayList<>(); //Tworzymy instancje ArrayList przypisując do zmiennej zwierzeta
        zwierzeta.add(papuga); // dodanie papugi do listy zwierząt
        zwierzeta.add(zolw); // dodanie żółwia do listy zwierząt
        //zwierzeta.add(0, zolw);
        wypisz(
            zwierzeta); //przy pomocy pętli for-each iterujemy po zwierzętach wywołując metodę dajGlos na każdym zwierzaku
        wypisz2(zwierzeta); //robi to samo co wypisz tylko przy pomocy zwykłego for'a
    }

    private static void wypisz2(List<Zwierze> zwierzeta) {
        for (int i = 0; i < zwierzeta.size(); ++i) {
            zwierzeta.get(i).dajGlos();
        }
    }

    private static void wypisz(List<Zwierze> zwierzeta) {
        for (Zwierze z : zwierzeta) {//List można używać z pętlą for-each tak jak zwykłych tablic
            z.dajGlos();
        }
    }
}
