package ru.job4j.tracker;

import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 20.08.2020.
 */

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}