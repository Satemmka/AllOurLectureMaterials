package Lectute4;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int numberFromConsole = scanner.nextInt();
        System.out.println("Your Number " + numberFromConsole);

       String stringFromConsole = scanner.nextLine();

    }

}
