package org.example.hw2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Дана последовательность целых чисел, оканчивающаяся нулем.
 * Найти сумму положительных чисел, после которых следует отрицательное число.
 */
public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            int fn = n;
            n = scanner.nextInt();
            if (n != 0) {
                if (fn > 0 && n < 0) {
                    sum += fn;
                }
            }
        }
        System.out.printf("Сумма равна: ", sum);
        scanner.close();
    }
}



