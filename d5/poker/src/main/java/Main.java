import java.util.HashMap;
import java.util.Map;
import java.util.Random;

enum WartoscKarty {
    AS("A"), KROL("K"), DAMA("D"), WALET("W"), DZIESIEC("10"),
    DZIEWIEC("9"), OSIEM("8"), SIEDEM("7"), SZESC("6"),
    PIEC("5"), CZTERY("4"), TRZY("3"), DWA("2");

    private final String symbol;

    WartoscKarty(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

enum KolorKarty {
    KARO('\u2666'), KIER('\u2764'), TREFL('\u2663'), PIK('\u2660');

    private final char symbol;

    KolorKarty(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}

class Karta {

    private WartoscKarty wartosc;
    private KolorKarty kolor;

    Karta(WartoscKarty wartosc, KolorKarty kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return wartosc.getSymbol() + kolor.getSymbol();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Karta karta = (Karta) o;

        if (wartosc != karta.wartosc) {
            return false;
        }
        return kolor == karta.kolor;
    }

    @Override
    public int hashCode() {
        int result = wartosc.hashCode();
        result = 31 * result + kolor.hashCode();
        return result;
    }
}

class Talia {

    Karta[] karty = new Karta[52];

    public Talia() {
        KolorKarty[] kolory = KolorKarty.values();
        WartoscKarty[] wartosci = WartoscKarty.values();
        int licznikKart = 0;
        for (int i = 0; i < kolory.length; i++) {
            for (int k = 0; k < wartosci.length; k++) {
                karty[licznikKart] = new Karta(wartosci[k], kolory[i]);
                licznikKart++;
                //i = 3, k =12 -> 51
                //i = 0, k = 0 -> 0
                //i = 0, k = 12 -> 12
                //i = 1, k = 0 -> 13
                //i = 1, k = 12 -> 25
            }
        }
    }

    public void wypiszTalie() {
        for (Karta karta : karty) {
            System.out.println(karta);
        }
    }

    public Karta[][] rozdaj(int liczbaRąk) {
        if (liczbaRąk > 10) {
            liczbaRąk = 10;
        }

        Random random = new Random(System.currentTimeMillis());
        int rozmiarRęki = 5;
        Karta[][] rece = new Karta[liczbaRąk][rozmiarRęki];
        for (int i = 0; i < liczbaRąk; ++i) {
            for (int k = 0; k < rozmiarRęki; ++k) {
                int indeksKarty = Math.abs(random.nextInt() % 52);
                while (karty[indeksKarty] == null) {
                    indeksKarty = Math.abs(random.nextInt() % 52);
                }
                rece[i][k] = karty[indeksKarty];
                karty[indeksKarty] = null;
            }
        }
        return rece;
    }
}

public class Main {

    public static void main(String[] args) {
        //Zamodeluj talię 52 kart przy pomocy klas i enum'a
        //Napisz metodę która z talii rozda n "rąk" po 5 kart, ręka to nic innego jak tablica 5 kart
        //Talia po wydaniu karty powinna nie wydać jej drugi raz
        //Po rozdaniu wypisz zawartość rąk na ekranie

        Karta k = new Karta(WartoscKarty.AS, KolorKarty.KARO);

        Talia talia = new Talia();
        Karta[][] rece = talia.rozdaj(3);
        zduplikowane(rece);
        wypiszRece(rece);

    }

    public static Map<Karta, Integer> zduplikowane(Karta[][] rece) {
        Map<Karta, Integer> kartyPerWystapienia = new HashMap<>();

        for (int i = 0; i < rece.length; i++) {
            for (int k = 0; k < rece[i].length; k++) {
                Karta obecnaKarta = rece[i][k];
                if (kartyPerWystapienia.containsKey(obecnaKarta)) {
                    Integer obecnaWartosc = kartyPerWystapienia.get(obecnaKarta);
                    kartyPerWystapienia.put(obecnaKarta, obecnaWartosc + 1);
                    System.out.println(obecnaKarta + " jest zduplikowana ");
                } else {
                    kartyPerWystapienia.put(obecnaKarta, 1);
                }
            }
        }
        return kartyPerWystapienia;
    }

    public static void wypiszRece(Karta[][] rece) {
        for (int i = 0; i < rece.length; i++) {
            for (int k = 0; k < rece[i].length; ++k) {
                System.out.print(rece[i][k]);
                System.out.print(",");
            }
            System.out.println("");
        }
    }
}
