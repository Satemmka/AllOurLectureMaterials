package Lecture3;

import java.util.Scanner;

public class SignComparatorLauncher {

    public static void main(String[] args) {


        int someNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a someNumber");

        someNumber = input.nextInt();
        input.close();

        if (someNumber > 0) {
            System.out.println("Number is positive");

        } else if (someNumber < 0) {
            System.out.println("Number is negative");

        } else {
            System.out.println("Number is equal to zero");
        }
    }
}























