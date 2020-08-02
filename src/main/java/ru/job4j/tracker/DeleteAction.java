package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 2.08.2020.
 */

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }


    @Override
    public String name() {
        return "= Delete item =";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Item is successfully deleted!");
        } else {
            System.out.println("Некорректный id!");
        }
        return true;
    }
}