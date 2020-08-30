package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortByNameItemTest {

    @Test
    public void ComparatorSort() {
        Item[] items = {new Item("Igor"), new Item("Petr"), new Item("Ivan"), new Item("Rail")};
        List<Item> expected = new ArrayList<>(Arrays.asList(items[3], items[1], items[2], items[0]));
        List<Item> actual = new ArrayList<>(Arrays.asList(items[0], items[1], items[2], items[3]));
        Collections.sort(actual, new SortByNameItem());
        assertThat(actual, is(expected));
    }
}