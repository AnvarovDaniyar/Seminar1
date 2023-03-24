package org.example.HomeWork3.hw2;

import org.example.HomeWork3.hw2.model.Nproduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя,
 * веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Hw2 {
    public static void main(String[] args) {
        Nproduct product1 = new Nproduct("мука", "Германия", 3, 100, 1);
        Nproduct product2 = new Nproduct("хлеб", "Россия", 9, 90, 2);
        Nproduct product3 = new Nproduct("гречка", "Албания", 6, 500, 2);
        Nproduct product4 = new Nproduct("картошка", "Китай", 5, 100, 1);

        List<Nproduct> nproductList = new ArrayList<>();
        nproductList.add(product1);
        nproductList.add(product2);
        nproductList.add(product3);
        nproductList.add(product4);
        int min = product1.getPrice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        int variety = scanner.nextInt();
        scanner.close();

        for (Nproduct product : nproductList) {
            if (product.getVariety() == variety && product.getPrice() < min) {
                min = product.getPrice();
            }

        }
        for (Nproduct product : nproductList) {
            if (product.getVariety() == variety && product.getPrice() == min) {
                System.out.println(product.getName() + " " + product.getPrice());
            }
        }
    }
}
