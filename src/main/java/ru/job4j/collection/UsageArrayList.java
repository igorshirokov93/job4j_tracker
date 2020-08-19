package ru.job4j.collection;

import java.util.ArrayList;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 19.08.2020.
 */

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Petr");
        name.add("Ivan");
        name.add("Stepan");

        for (Object value : name) {
            System.out.println(value);
        }
    }
}