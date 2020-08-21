package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 21.08.2020.
 */

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task name : list) {
            numbers.add(name.getNumber());
        }
        return numbers;
    }
}