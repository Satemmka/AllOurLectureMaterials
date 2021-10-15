package Lecture2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumberOne = random.nextInt(181);
        int randomNumberTwo = random.nextInt(181);
        int result = randomNumberOne + randomNumberTwo;
        System.out.println("this is random number one: " + randomNumberOne);
        System.out.println("this is random number two: " + randomNumberTwo);
        System.out.println("this is random number sum: " + result);
    }
}
