package ru.job4j.tracker;

import java.util.List;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 20.08.2020.
 */

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "= Find items by name =";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}