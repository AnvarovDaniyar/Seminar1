package org.example.HomeWork2.hw3;

import java.util.Arrays;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class hw3 {
    public static void main(String[] args) {
        int[] arr = {6, -2, 23, -4, 8, -55, -3, 32};
        System.out.println(Arrays.toString(indexSum(arr)));
    }

    private static int[] indexSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 < 10 && Math.abs(arr[i]) / 10 > 0) {
                sum += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }

        return arr;
    }
}
