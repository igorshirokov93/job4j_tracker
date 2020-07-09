package ru.job4j.sort;

import java.util.Arrays;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 09.07.2020.
 */

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change - coins[i] >= 0) {
                rsl[size] = coins[i];
                change -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}