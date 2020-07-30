package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 30.07.2020.
 */

public interface Input {
    String askStr(String question);

    int askInt(String question);
}
