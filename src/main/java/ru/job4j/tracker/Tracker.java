package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 27.07.2020.
 */

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int count = 0;
        Item[] itemsWithoutNull = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                itemsWithoutNull[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }

    public Item[] findByName(String key) {
        Item[] found = new Item[size];
        int matched = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                found[matched++] = items[i];
            }
        }
        return Arrays.copyOf(found, matched);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}