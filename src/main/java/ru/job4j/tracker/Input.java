package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 08.08.2020.
 */

public interface Input {
    String askStr(String question);

    int askInt(String question);
}
