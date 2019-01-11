public class Main {

    public static void main(String[] args) {
        zamiana();
        System.out.println("");
        tokenizacja();
        System.out.println("");
        walidacja();
    }

    private static void zamiana() {
        System.out.println("korek, kotek, kolec, koper".replaceAll("ko.ek", "*"));
        System.out.println("kat, kkat, kkkat, kret, klat".replaceAll("k+at", "*"));
        System.out.println("rama, kama, dama".replaceAll("r*ama", "*"));
        System.out.println("korek, kotek, kolec, koper".replaceAll(".+", "*"));
        System.out.println("korek, kotek, kolec, koper".replaceAll(".*", "*"));
        System.out.println("ul. Wolności 24 m. 5 42-200 CZWA".replaceAll("\\d+", "*"));
        System.out.println("Numer karty: 6234-2332-3322-3002 ".replaceAll("\\d{4}-\\d{4}-\\d{4}-\\d{4}", "****"));
        System.out.println("TAG teksts TAG".replaceAll("^TAG", "****"));
        System.out.println("TAG teksts TAG".replaceAll("TAG$", "****"));
        System.out.println("Ala, Aga, Ania, Basia".replaceAll("(\\w+)", "Imię: $1"));
    }

    private static void tokenizacja() {
        String[] tokeny = "Jan:Nowak:29".split(":");
        for (String token : tokeny) {
            System.out.println(token);
        }

        String[] tokeny2 = "Jan Kowalski    30".split("\\s+");
        for (String token : tokeny2) {
            System.out.println(token);
        }
    }

    private static void walidacja() {
        System.out.println(czyPoprawnyKodPocztowy("42-200"));
        System.out.println(czyPoprawnyKodPocztowy("42-abc"));
        System.out.println(czyPoprawnyKodPocztowy("po-avc"));
    }

    private static boolean czyPoprawnyKodPocztowy(String s) {
        String wzorzecKoduPocztowego = "\\d{2}-\\d{3}";

        return s.matches(wzorzecKoduPocztowego);
    }
}
