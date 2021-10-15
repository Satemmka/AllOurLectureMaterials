package Lectute4;

public class DemoMinNumber {

    public static void main(String[] args) {

        int[] array = {1, -2, 23, 14, 51, 6, 21, 34, 8, 0};
        int min = array[0];

        for (int i = 1; i < array.length; i++) {


            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimal number " + min);
    }
}