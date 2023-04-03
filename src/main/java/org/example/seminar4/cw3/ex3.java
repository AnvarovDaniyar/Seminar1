package org.example.seminar4.cw3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Заменить некратные 3 элементы списка, суммой нечетных элементов.
 */
public class ex3 {
    public static void main(String[] args) {
        List<Integer> somelist = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(solutions11(somelist));
    }

    /**
     *
     * @param somelist исходный список значений
     * @return список после изменений
     */
    private static List<Integer> solutions11(List<Integer> somelist) {
        int sum = 0;
        for (Integer el : somelist) {
            if (el % 2 != 0) {
                sum += el;
            }
        }
        for (int i = 0; i < somelist.size(); i++) {
            if (somelist.get(i) % 3 != 0) {
                somelist.set(i, sum);
            }
        }
        return somelist;
    }
}
