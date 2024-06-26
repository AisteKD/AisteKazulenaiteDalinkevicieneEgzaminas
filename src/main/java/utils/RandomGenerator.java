package utils;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomUserName() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Aiste";

    }

    public static String generateRandomPass() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Selenium@9";
    }
}
