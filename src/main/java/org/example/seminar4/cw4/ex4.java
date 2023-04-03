package org.example.seminar4.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * построить однонаправленый список. Удалить отрицательные элементы.
 */
public class ex4 {
    public static void main(String[] args) {
        List<Integer> somelist = new LinkedList<>(Arrays.asList(1, -2, -3, 4, 5, -6, 7, -8, -9));
        System.out.println(solutions12(somelist));
    }

    private static List<Integer> solutions12(List<Integer> somelist) {
        for (int i = somelist.size()-1; i >=0; i--) {
            if (somelist.get(i) < 0) {
                somelist.remove(i);

            }
        }
        return somelist;
    }
}
