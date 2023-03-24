package org.example.HomeWork3.hw1;

import org.example.HomeWork3.hw1.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Hw1 {
    public static void main(String[] args) {
        Product product1 = new Product("высший хлеб", 150, 2);
        Product product2 = new Product("ржаной хлеб", 90, 1);
        Product product3 = new Product("сок высший", 270, 2);
        Product product4 = new Product("свежий высший помидор", 310, 3);

        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        int max = 0;
        String prodName = null;
        for (Product product : listProduct) {
            if (product.getName().contains("высший") && product.getVariety() == 1 ||
                    product.getVariety() == 2 && max < product.getPrice()) {
                max = product.getPrice();
                prodName = product.getName();
            }
        }System.out.println(prodName + " " + max);
    }
}
