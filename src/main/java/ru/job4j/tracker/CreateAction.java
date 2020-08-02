package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 2.08.2020.
 */

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "= Create a new Item =";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Заявка успешно добавлена!");
        return true;
    }
}