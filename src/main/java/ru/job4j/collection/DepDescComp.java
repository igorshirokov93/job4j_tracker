package ru.job4j.collection;

import java.util.Comparator;

/**
 * DepDescComp - класс для сортировки подразделений по убыванию
 *
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 28.10.2020.
 */

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        String[] str1 = left.split("/");
        String[] str2 = right.split("/");
        if (str1[0].equals(str2[0])) {
            result = left.compareTo(right);
        } else {
            result = right.compareTo(left);
        }
        return result;
    }
}