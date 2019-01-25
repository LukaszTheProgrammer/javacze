import java.util.Scanner;

interface Plant {

    void water(int waterInMilimiters);

    void grow();
}

class Cactus implements Plant {

    int size;
    int waterLevel;

    Cactus(int size) {
        this.size = size;
        this.waterLevel = 5;
    }

    @Override
    public void water(int waterInMilimiters) {
        if (waterInMilimiters < 0) {
            waterLevel--;
        } else {
            waterLevel += waterInMilimiters;
        }
    }

    @Override
    public void grow() {
        if (waterLevel > 0) {
            size += 2;
            waterLevel--;
        }
    }

    @Override
    public String toString() {
        return "Cactus of size: " + size;
    }
}

class Tulip implements Plant {

    int size;
    int waterLevel;

    public Tulip(int size) {
        this.size = size;
        waterLevel = 5;
    }

    @Override
    public void water(int waterInMilimiters) {
        waterLevel += waterInMilimiters;
    }

    @Override
    public void grow() {
        if (waterLevel > 5 && waterLevel < 30) {
            size += 4;
        } else if (waterLevel <= 5 && waterLevel > 0) {
            size += 2;
        } else if (waterLevel >= 30) {
            size += 1;
        } else {
            size--;
        }
        waterLevel -= 2;
    }

    @Override
    public String toString() {
        return "Tulip of size: " + size;
    }
}


class Grass implements Plant {

    int size;
    int waterLevel;

    public Grass(int size) {
        this.size = size;
        waterLevel = 1;
    }

    @Override
    public void water(int waterInMilimiters) {
        waterLevel += waterInMilimiters;
    }

    @Override
    public void grow() {
        if (waterLevel > 0) {
            size += 5;
        } else {
            size -= 2;
        }
        waterLevel -= 1;
    }

    @Override
    public String toString() {
        return "Grass of size: " + size;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plant cactus = new Cactus(2);
        Plant tulip = new Tulip(1);
        Plant grass = new Grass(3);
        Plant[] plants = new Plant[]{cactus, tulip, grass};
        boolean exit = false;

        while (!exit) {
            System.out.println("Podaj zdarzenie: D - deszcz, S - susza");
            String event = scanner.nextLine();
            switch (event) {
                case "D":
                    symuluj(plants, 5);
                    break;
                case "S":
                    symuluj(plants, -3);
                    break;
                default:
                    exit = true;
            }
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }

    private static void symuluj(Plant[] plants, int waterLevel) {
        for (Plant plant : plants) {
            plant.water(waterLevel);
            plant.grow();
        }
    }
}
