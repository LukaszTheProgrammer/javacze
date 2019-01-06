import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać nazwę pliku");
        String filename = scanner.nextLine();

        //true jako drugi parametr do FileWriter'a powoduje że nasz plik jest otwarty
        //w trybie 'append' co rozumie się jako dopisz a nie zastąp
        String filePath = "/Users/lukasz/"+filename;
        FileWriter fileWriter = new FileWriter(filePath, true);
        //Klasa writera która odpowiada za buforowanie zapisu do pliku
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //PrintWriter pisze do pliku wykorzystując klasy BufferedWritera oraz FileWritera
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        while(true){
            System.out.println("Proszę o linię");
            String linia = scanner.nextLine();
            if(linia.equalsIgnoreCase("!zapisz")){
                printWriter.close();
                break;
            } else{
                printWriter.println(linia);
            }
        }

        Scanner fileReader = new Scanner(new File(filePath));
        while(fileReader.hasNext()){
            System.out.println(fileReader.nextLine());
        }

    }
}