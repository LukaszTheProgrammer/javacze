import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        String zdanie = "W Warszawie pada deszcz.";
        Map<Character, Integer> literyPerWystapienia = new HashMap<>();
        for (Character c : zdanie.toCharArray()) {
            if (literyPerWystapienia.containsKey(c)) {
                Integer obecnaWartosc = literyPerWystapienia.get(c);
                literyPerWystapienia.put(c, ++obecnaWartosc);
            } else {
                literyPerWystapienia.put(c, 1);
            }
        }

        for(Entry<Character, Integer> entry : literyPerWystapienia.entrySet()){
            System.out.println("'"+entry.getKey()+"' -> "+entry.getValue());
        }
    }
}
