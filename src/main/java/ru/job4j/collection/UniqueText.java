package ru.job4j.collection;

import java.util.HashSet;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 21.08.2020.
 */

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String original : origin) {
            check.add(original);
        }
        for (String word : text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}