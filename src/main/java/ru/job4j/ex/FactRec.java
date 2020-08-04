package ru.job4j.ex;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 4.08.2020.
 */

public class FactRec {
    public static int calc(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        } else {
            result = calc(n - 1) * n;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = calc(6);
        System.out.println(rsl);
    }
}