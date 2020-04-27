package ru.job4j.oop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 27.04.2020.
 */

public class Animal {

    public Animal() {
        super();
        System.out.println("load animal");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
