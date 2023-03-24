package org.example.HomeWork3.hw3;

import org.example.HomeWork3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
 * в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Hw3 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 700, 1867, 960);
        Book book2 = new Book("Метро 2035", "Глуховский", 620, 2015, 607);
        Book book3 = new Book("Происхождение", "Браун", 300, 2017, 379);
        Book book4 = new Book("Позже", "Кинг", 540, 2021, 320);
        Book book5 = new Book("Мара и Морок. 500 лет назад", "Арден", 490, 2021, 449);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books){
            if (isPrimeNum(book.getList()) &&book.getAuthor().contains("а")||book.getAuthor().contains("А")&&book.getYear()>2010) {
                System.out.println(book.getName());
            }
        }

    }
    private static boolean isPrimeNum(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
