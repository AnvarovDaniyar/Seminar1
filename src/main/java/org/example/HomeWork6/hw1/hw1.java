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
}
