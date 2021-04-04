package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var findTask = queue.take();
        assertThat(findTask.getDesc(), is("urgent"));
    }

    @Test
    public void whenMiddlePriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 15));
        queue.put(new Task("urgent", 8));
        queue.put(new Task("middle", 1));
        var findTask = queue.take();
        assertThat(findTask.getDesc(), is("middle"));
    }

    @Test
    public void whenTopmostPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("rock-bottom", 8));
        queue.put(new Task("low", 5));
        queue.put(new Task("insignificant", 4));
        queue.put(new Task("middle", 3));
        queue.put(new Task("urgent", 2));
        queue.put(new Task("topmost", 1));
        var result = queue.take();
        var nextRes = queue.take();
        assertThat(result.getDesc(), is("topmost"));
        assertThat(nextRes.getDesc(), is("urgent"));
    }
}