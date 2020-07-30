package ru.job4j.poly;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 30.07.2020.
 */

public interface Transport {
    void drive();

    void passengers(int passengers);

    double fill(double fuel);
}