package org.example.HomeWork5.h2;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 */
public class hw2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("дерево", 0);
        String str = "Дерево- огурец. помидор дерево, дерево";
        str = str.toLowerCase();
        str = str.replaceAll("[-,—.+]", "");
        String[] words = str.split(" ");

        int sum = 0;
        for (String word : words) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
        }
        System.out.println(map);
    }
}

