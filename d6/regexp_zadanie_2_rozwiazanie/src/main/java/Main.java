import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Firma {

    private String nazwa;
    private String nip; // "XXX-XXX-XX-XX"

    public Firma(String nazwa, String nip) {
        this.nazwa = nazwa;
        this.nip = nip;
    }

    @Override
    public String toString() {
        return String.format("Nazwa: %s, nip: %s", nazwa, nip);
    }
}

class NiepoprawnyFormat extends RuntimeException {

    public NiepoprawnyFormat(String message) {
        super(message);
    }
}

class Lista {
    private Firma [] firmy;
    private int obecnyIndeks;

    public Lista() {
        this.firmy = new Firma[100];
        obecnyIndeks = 0;
    }

    public void dodaj(Firma firma){
        this.firmy[obecnyIndeks] = firma;
        obecnyIndeks++;
    }

    public int size() {
        return obecnyIndeks;
    }

    public Firma get(int i) {
        return firmy[i];
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        Lista lista = new Lista();
        while (true) {
            try {
                System.out.println("Wprowadź dane firmy:");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                if (line.equals("exit")) {
                    break;
                }
                String[] nazwaINip = line.split("\\s+");
                if (nazwaINip.length != 2) {
                    throw new NiepoprawnyFormat("Dane firmy powinny być postaci <nazwa> <nip>");
                }
                String nazwa = nazwaINip[0];
                String nip = nazwaINip[1];
                validujNip(nip);
                lista.dodaj(new Firma(nazwa, nip));
                System.out.println("Utworzono firmę!");
            } catch (NiepoprawnyFormat niepoprawnyFormat) {
                System.out.println(niepoprawnyFormat.getMessage());
            }
        }

        zapiszDoPliku(lista);
    }

    private static void zapiszDoPliku(Lista lista) throws IOException {
        String filePath = "/Users/lukasz/firmy.txt";
        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        for (int i = 0; i < lista.size(); ++i) {
            printWriter.println(lista.get(i));
        }
        printWriter.close();
    }

    private static void validujNip(String nip) {
        String wzorzecNipu = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        if (!nip.matches(wzorzecNipu)) {
            throw new NiepoprawnyFormat("Nip nie pasuje do wzorca xxx-xxx-xx-xx");
        }
    }
}
