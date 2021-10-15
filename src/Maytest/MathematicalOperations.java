package Maytest;

public class AmountPlus {
    public static void main(String[] args) {

        System.out.println(2+2);
        System.out.println(2*2);
        System.out.println(2/2);
        System.out.println(2-2);
        System.out.println(10.0/2);
        System.out.println(2/1.5);

        System.out.println("1" + "2"); // строки склеиваются, можно только прибавлять
        System.out.println("1" + 2);

        System.out.println(2 + 2 * 2); // сначала идет умножение
        System.out.println((2 + 2) * 2); // прибавление, потом умножение
        System.out.println("2 + 2 = " + (2 + 2)); // сначала складывается в скобкахб после этого результат в строку и потом склеиваться со 2 строкой

    }
}
