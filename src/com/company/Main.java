package com.company;

import java.util.Random;

public class Main {

    private static int men;
    private static int temp;

    public static void ageAndTemperature(int men, int temp) {
        Main.men = men;
        Main.temp = temp;
        if (men > 20 && men < 45 && temp > -20 && temp < 30) {
            System.out.println("Можно идти гулять");
        } else if (men < 20 && temp >= 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        } else if (men < 20 && temp >= 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }

    public static void main(String[] args) {
        ageAndTemperature(16, -23);
        ageAndTemperature(25, 27);
        ageAndTemperature(19, -26);
        ageAndTemperature(28, 29);
        ageAndTemperature(23, -25);
        ageAndTemperature(24, 28);
        generateRandomAge();
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int x = random.nextInt(70) + 1;
        return x;
    }
}

