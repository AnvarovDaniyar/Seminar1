package org.example.cw1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int sum = 0, multi = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("result : %d", subtractProductionAndSum(n));

    }

    public static int subtractProductionAndSum(int n) {
        int multi = 1, sum = 0;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
