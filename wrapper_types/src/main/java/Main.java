public class Main {

    public static void main(String[] args) {

        konstrukcja();
        boxing();
        unboxing();
        rzutowanie();
    }

    private static void konstrukcja() {
        System.out.println("\n konstrukcja");
        Integer i1 = Integer.valueOf("123");
        Integer i2 = Integer.valueOf("101", 2);

        System.out.println(i1);
        System.out.println(i2);

        Double d = Double.valueOf("220.75");
        System.out.println(d);

        Boolean b = Boolean.TRUE;
        System.out.println(b); //true

        System.out.println(Character.isDigit('1')); //true
        System.out.println(Character.isAlphabetic('1')); //false
        System.out.println("\n");
    }

    private static void boxing() {
        Integer i = 123;
        Double d = 20.2d;
        Short s = 34;
        Byte b = 125;
        Character c = 'a';
        Long l = 125l;
        System.out.println("\n boxing");
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println("");
    }

    private static void unboxing() {
        int i = Integer.valueOf("240");
        double d = Double.valueOf("22.2");
        long l = Long.valueOf("125");


        System.out.println("\n unboxing");
        System.out.println(i);
        System.out.println(d);
        System.out.println(l);
        System.out.println("");
    }

    private static void rzutowanie() {

        int i = 125;
        int l = i;

        Integer ii = 125;
        //Long ll = ii;
        //Long ll1 = (Long) ii; nie można zrzutować Integer'a do Longa
        Long ll1 = (long) ii; // działa ponieważ zachodzi unboxing a następnie boxing
        Long ll2 = ii.longValue(); // wydajniejsze podejście

        Double d = ii.doubleValue();
    }
}