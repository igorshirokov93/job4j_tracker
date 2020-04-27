package ru.job4j.oop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 27.04.2020.
 */

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("load predator");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
