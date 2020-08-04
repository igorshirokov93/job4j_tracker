package ru.job4j.ex;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 4.08.2020.
 */

public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial: " + calc(5));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should not be less than 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}