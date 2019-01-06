class Main {

    public static void main(String[] args) {
        printMany();
        printMany(1, 2, 3, 4, 5, 6);
        System.out.println("");
        System.out.println("");
        printOneOrMany(1);
        printOneOrMany(1, 2, 3, 4, 5);
    }

    //funkcje które w sygnaturze mają po typie ... są funkcjami o zmiennej liczbie argumentów t.zw. varargs
    //taką funkcję możemy wywołać z 0 lub wieloma argumentami
    private static void printMany(int... ints) {
        System.out.println("Wywołanie printMany");
        for (int i : ints) {
            System.out.println(i);
        }
    }

    //funkcja może mieć tylko jeden varargs i jeśli są inne argumenty to muszą być one przed argumentem varargs
    //poniższą funkcję można wywołać z 1 lub większą liczbą argumentów
    private static void printOneOrMany(int arg0, int... ints) {
        System.out.println("Wywołanie printOneOrMany");
        System.out.println(arg0);
        printMany(ints);
    }
}
