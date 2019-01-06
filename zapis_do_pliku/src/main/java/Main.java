import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        //true jako drugi parametr do FileWriter'a powoduje że nasz plik jest otwarty
        //w trybie 'append' co rozumie się jako dopisz do istniejącego a nie zastąp
        FileWriter fileWriter = new FileWriter("plik_do_zapisu.txt", true);
        //Klasa writera która odpowiada za buforowanie zapisu do pliku
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //PrintWriter pisze do pliku wykorzystując klasy BufferedWritera oraz FileWritera
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.println("Zapisujemy pierwszą linię");//zapisz nową linię
        printWriter.close();
    }
}