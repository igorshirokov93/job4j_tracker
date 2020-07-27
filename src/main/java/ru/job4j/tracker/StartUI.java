package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 27.07.2020.
 */

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("Job4j2020");
        tracker.add(item);
        tracker.findById(item.getId());
        System.out.println(item);
    }
}