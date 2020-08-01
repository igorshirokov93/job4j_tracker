package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 1.08.2020.
 */

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}