package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 1.08.2020.
 */

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}