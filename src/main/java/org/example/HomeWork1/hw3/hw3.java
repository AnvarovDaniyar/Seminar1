package org.example.HomeWork1.hw3;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        String a = scanner.next();
        System.out.println("Введите число b: ");
        String b = scanner.next();


        System.out.printf(addBinary(a, b));
        scanner.close();
    }


    public static String addBinary(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int res = 0;
        int a1length = a1.length - 1;
        int b1length = b1.length - 1;
        StringBuilder s = new StringBuilder();
        while (a1length >= 0 && b1length >= 0) {
            int a2 = a1[a1length]-'0';
            int b2 = b1[b1length]-'0';
            int sum = a2 + b2 + res;
            res = sum / 2;
            s.append(sum % 2);
            a1length--;
            b1length--;
        }
        while (a1length >= 0) {
            int a2 = a1[a1length]-'0';
            int sum = a2 + res;
            res = sum / 2;
            s.append(sum % 2);
            a1length--;
        }
        while (b1length >= 0) {
            int b2 = b1[b1length]-'0';
            int sum = b2 + res;
            res = sum / 2;
            s.append(sum % 2);
            b1length--;
        }

        if (res != 0) {
            s.append(res);
        }
        return s.reverse().toString();
    }
}