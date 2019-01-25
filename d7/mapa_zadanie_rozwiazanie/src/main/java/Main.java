import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        String zdanie = "W Warszawie pada deszcz.".toUpperCase();
        Map<Character, Integer> literyPerWystapienia = new HashMap<>();
        char[] znaki = zdanie.toCharArray();

        for (char c : znaki) {
            if (literyPerWystapienia.containsKey(c)) {
                Integer obecnaWartosc = literyPerWystapienia.get(c);
                literyPerWystapienia.put(c, obecnaWartosc + 1);
            } else {
                literyPerWystapienia.put(c, 1);
            }
        }

        System.out.println(literyPerWystapienia.entrySet());

        for (Entry<Character, Integer> entry : literyPerWystapienia.entrySet()) {
            System.out.print("'" + entry.getKey() + "' -> " + entry.getValue());
            System.out.print(", ");
        }

        System.out.println("\nLiczba unikatowych znaków to:" + literyPerWystapienia.size());

        int licznik = 0;
        for (Entry<Character, Integer> entry : literyPerWystapienia.entrySet()) {
            if (entry.getValue().equals(1)) {
                licznik++;
            }
        }

        System.out.println("Liczba znaków występujących dokładnie raz to:" + licznik);
    }
}
