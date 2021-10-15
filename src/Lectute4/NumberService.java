package Lectute4;

import java.util.Arrays;

public class NumberService {

    int[] array;

public void createArray(int start, int finish) {
    array = new int[finish - start + 1];
}


    public int rangeSum(int start, int finish) {
        int sum = 0;
        createArray(start, finish);
        int[] array = new int[0];
        if (start < finish) {
            array = new int[finish - start + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = start + 1;
        }
        System.out.println("Array for counting sum is: " + Arrays.toString(array));

    } else if (start > finish) {
        array = new int[start - finish + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = start - 1;
        }
        System.out.println("Array for counting sum is: " + Arrays.toString(array));
    }
        for (int i = 0; i < array.length; i++) {
        sum += array[i];
        }
        System.out.println("Sum of range is " + sum);
        return sum;
}

    public int rangeEventCount(int start,int finish) {
        int evenCount = 0;
       createArray(start, finish);
        int[] array = new int[finish - start + 1];
        if(start < finish) {
        array = new int[finish - start + 1];
        for(int i = 0; i < array.length; i++) {
        array[i] = start + i;
        }
        System.out.println("Array for counting even number is: " + Arrays.toString(array));

        } else if (start > finish) {
        array = new int[start - finish + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = start - i;
        }
        System.out.println("Array for counting even number is: " + Arrays.toString(array));
        }
        for(int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0)
        evenCount++;
        }
        System.out.println("Even count is: " + evenCount);
        return evenCount;
        }
        }








