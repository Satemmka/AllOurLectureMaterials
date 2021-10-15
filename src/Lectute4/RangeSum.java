package Lectute4;

import java.util.Scanner;
 import java.util.concurrent.LinkedTransferQueue;


public class RangeSum {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Введите начальное значение");
int start = new Scanner(System.in). nextInt();
        System.out.println("Введите end значение");
        int finish = new Scanner(System.in). nextInt();
        int j =0;
        for (int i = start; i<=finish; i++) {
        sum += i;
        j++;
            System.out.println("Summa " +sum);
            System.out.println("Srednee arifmeticheskoe "  + ((double)sum/j));
            int refresh = new Scanner(System.in).nextInt();
        }

    }
}


