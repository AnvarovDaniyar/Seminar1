package org.example.seminar4.cw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * постороить однонаправленый список целых чисел. Найти сумму четных элементов списка.
 */
public class ex2 {
    public static void main(String[] args) {
        List<Integer> somelist = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : somelist) {
            if (el % 2 == 0) {
                sum += el;
            }
        }
        System.out.println(sum);
    }
}
