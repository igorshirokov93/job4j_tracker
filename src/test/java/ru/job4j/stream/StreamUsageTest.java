package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class StreamUsageTest {
    @Test
    public void testWhenOnlyBugs() {
        List<StreamUsage.Task> tasks = List.of(
                new StreamUsage.Task("Bug #1", 10),
                new StreamUsage.Task("Task #2", 20),
                new StreamUsage.Task("Bug #3", 40),
                new StreamUsage.Task("Bug #4", 50)
        );
        List<StreamUsage.Task> actual = tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .collect(Collectors.toList());
        List<StreamUsage.Task> expected = List.of(
                new StreamUsage.Task("Bug #3", 40),
                new StreamUsage.Task("Bug #4", 50)
        );
        assertThat(actual, is(equalTo(expected)));
    }
}