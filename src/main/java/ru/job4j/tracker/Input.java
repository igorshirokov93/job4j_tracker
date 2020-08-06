package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 06.08.2020.
 */

public interface Input {
    String askStr(String question);

    int askInt(String question);

    int askInt(String question, int max);
}
