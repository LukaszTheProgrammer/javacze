class Matematyka {

    static int wartoscBezwzgledna(int liczba) {
        if (liczba >= 0) {
            return liczba;
        } else {
            return liczba * -1;
        }
    }

    static boolean czyParzysta(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}