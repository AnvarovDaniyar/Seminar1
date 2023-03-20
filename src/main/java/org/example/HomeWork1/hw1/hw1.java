package org.example.HomeWork1.hw1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String revText = "";
        String[] res = str.split(" ");
        for (int i = res.length - 1; i >= 0; i--) {
            revText += res[i] + " ";
        }
        System.out.println(revText.trim());
        scanner.close();

    }
}
