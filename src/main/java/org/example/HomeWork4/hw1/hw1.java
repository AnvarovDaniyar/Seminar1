package org.example.HomeWork4.hw1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1->2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class hw1 {
    public static void main(String[] args) {

        LinkedList<Integer> somelist = new LinkedList<>();
        for (int i = 1; i < 7; i++) {
            somelist.add(i);
        }
        System.out.println(somelist);
        System.out.println(reversList(somelist));
    }

    private static LinkedList reversList(LinkedList<Integer> somelist) {
        Stack<Integer> stackInt = new Stack<>();
        stackInt.addAll(somelist);
        somelist.clear();
        while (!stackInt.empty())
            somelist.add(stackInt.pop());
        return somelist;
    }
}
