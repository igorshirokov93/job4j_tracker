package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 30.07.2020.
 */

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                String name = input.askStr("Enter name: ");
                if (tracker.replace(id, new Item(name))) {
                    System.out.println("Item is successfully replaced!");
                } else {
                    System.out.println("Некорректный id!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("Item is successfully deleted!");
                } else {
                    System.out.println("Некорректный id!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int id = Integer.valueOf(input.askStr("Enter id: "));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Указанный id не найден!");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 6) {
                System.out.println("=== Exit ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}