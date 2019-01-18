import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Map<String, String> paryTaneczne = new HashMap<>();
        paryTaneczne.put("Marek", "Anna");
        paryTaneczne.put("Janek", "Wiola");
        paryTaneczne.put("Stanisław", "Basia");

        for (Entry<String, String> entry : paryTaneczne.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nCzy mapa posiada Marka:" + paryTaneczne.containsKey("Marek"));
        System.out.println("\nCzy mapa posiada Anne:" + paryTaneczne.containsKey("Anna"));
        System.out.println("\nParę z Jankiem tworzy "+paryTaneczne.get("Janek"));

        System.out.println("\nKluczami w mapie są:");
        for(String key: paryTaneczne.keySet()){
            System.out.println(key);
        }

        System.out.println("\nWartościami w mapie są:");
        for(String value: paryTaneczne.values()){
            System.out.println(value);
        }

    }
}
