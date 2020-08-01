package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 1.08.2020.
 */

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        return true;
    }
}