package ru.job4j.inheritance;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 24.07.2020.
 */

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                "name" + ":" + name + "," + System.lineSeparator() +
                "body" + ":" + body + System.lineSeparator() +
                "}";
    }
}