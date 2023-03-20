package org.example.HomeWork2.hw1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(sumPrimeNum(array));
    }

    private static boolean isPrimeNum(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumPrimeNum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])) sum += 1;
        }
        return sum;
    }
}
