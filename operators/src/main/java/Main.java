public class Main {

    public static void main(String[] args) {
        int a = 5;
        a += 10; // a = 15, zapis równoznaczny z a = a + 10
        a *= 3; // a = 45, zapis równoznaczny z a = a * 3
        a -= 5;   // a = 40, zapis równoznaczny z a = a - 5
        a /= 2;  // a = 20, zapis równoznaczny z a = a / 2

        System.out.println(a);

        System.out.println(a++); // wyświetli 20, ponieważ a zostanie zinkrementowane
        // po przekazaniu do funkcji println, powyższy zapis jest skrótem dla:
        //System.out.println(a);
        //a = a + 1;

        System.out.println(++a); // wyświetli 22, ponieważ a zostanie zinkrementowane
        // przed przekazaniem do funkcji println, powyższy zapis jest skrótem dla:
        //a = a + 1;
        //System.out.println(a);

        System.out.println(a--); // wyświetli 22
        System.out.println(--a); // wyświetli 20
    }
}