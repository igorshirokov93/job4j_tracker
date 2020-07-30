package ru.job4j.oop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 30.07.2020.
 */

public class College {
    public static void main(String[] args) {
        /* создаем объект класса Freshman. */
        Freshman freshman = new Freshman();
        /* делаем приведение к типу родителя Student. */
        Student st = freshman;
        /* делаем приведение к типу родителя Object. */
        Object object = freshman;
    }
}