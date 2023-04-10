package org.example.HomeWork6.hw1;

import org.example.HomeWork6.hw1.modul.Notebook;


import java.util.*;

public class hw1 {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Asus", 8, 512, "DOS", "grey"));
        set.add(new Notebook("Lenovo", 32, 512, "Windows 11", "black"));
        set.add(new Notebook("Apple", 64, 1000, "IOS", "pink"));
        set.add(new Notebook("HP", 16, 256, "Windows 11", "silver"));



        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();
        System.out.println(set);
    }

   /** private static void sreiben() {
        Map<String, Integer> requirements = new HashMap<>();
        System.out.println("Введите минимальный размер ОЗУ: ");
        Scanner scanner = new Scanner(System.in);
        requirements.put("ОЗУ", scanner.nextInt());
        System.out.println("Введите минимальный Объем ЖД: ");
        requirements.put("ОбъемЖД", scanner.nextInt());
        System.out.println("Введите желаемую Операционную систему: ");
        requirements.put("ОперационнаяСистема", );

    }**/
}
