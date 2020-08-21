package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 21.08.2020.
 */

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account current : accounts) {
            rsl.add(current);
        }
        return rsl;
    }
}