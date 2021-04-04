package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = List.of(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        Set<String> expected = new HashSet<>(List.of("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }

    @Test
    public void extractNumberTwo() {
        List<Task> tasks = List.of(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("3", "Third desc"),
                new Task("2", "Second desc"),
                new Task("5", "Fifth desc"),
                new Task("6", "Sixth desc"),
                new Task("7", "Seventh desc"),
                new Task("5", "Fifth desc")
        );
        Set<String> expected = new HashSet<>(List.of("1", "2", "3", "5", "6", "7"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}