package org.example.HomeWork5.h1;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class hw1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        str = str.toLowerCase();
        str = str.replaceAll("[—.]", "");
        String[] words = str.split(" ");
        for (String word : words) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        System.out.println(map);
    }
}




