package ru.job4j.pojo;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 26.07.2020.
 */

public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book("Clean code", 352);
        Book headfirst = new Book("Head First Java", 717);
        Book machinelearning = new Book("Java Machine Learning", 725);
        Book hibernate = new Book("Hibernate", 633);
        Book[] books = new Book[4];
        books[0] = cleancode;
        books[1] = headfirst;
        books[2] = machinelearning;
        books[3] = hibernate;
        for (int index = 0; index < books.length; index++) {
            Book bs = books[index];
            System.out.println(bs.getTitle() + " - " + bs.getPages());
        }
        System.out.println("Replace Clean Code to Hibernate:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bs = books[index];
            System.out.println(bs.getTitle() + " - " + bs.getPages());
        }
        System.out.println("Shown only books titled Clean Code:");
        for (int index = 0; index < books.length; index++) {
            Book bs = books[index];
            /** Т.к. класс Book не содержит equals, то просто получаю имя книги и сравниваю с "Clean code" */
            if (bs.getTitle().equals(cleancode.getTitle())) {
                System.out.println(bs.getTitle() + " - " + bs.getPages());
            }
        }
    }
}