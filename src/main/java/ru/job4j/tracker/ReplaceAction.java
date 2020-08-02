package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 2.08.2020.
 */

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "= Edit item =";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Item is successfully replaced!");
        } else {
            System.out.println("Некорректный id!");
        }
        return true;
    }
}