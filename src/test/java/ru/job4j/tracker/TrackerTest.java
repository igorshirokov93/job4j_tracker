package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("first");
        Item item2 = new Item("second");
        tracker.add(item1);
        tracker.add(item2);
        List<Item> expected = List.of(item1, item2);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("first");
        Item item2 = new Item("second");
        Item item3 = new Item("first");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> expected = List.of(item1, item3);
        List<Item> result = tracker.findByName("first");
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("first");
        Item item2 = new Item("second");
        Item item3 = new Item("first");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item result = tracker.findById(item2.getId());
        assertThat(result, is(item2));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenCreateTrackerWithEnumThenItSingleton() {
        TrackerSingleEnum tracker = TrackerSingleEnum.INSTANCE;
        Tracker tracker1 = tracker.getTracker();
        Tracker tracker2 = tracker.getTracker();
        assertThat(tracker1, is(tracker2));
    }

    @Test
    public void whenCreateTrackerWithStaticFieldAndLazyLoadingThenItSingleton() {
        Tracker tracker1 = TrackerSingleLazy.getInstance();
        Tracker tracker2 = TrackerSingleLazy.getInstance();
        assertThat(tracker1, is(tracker2));
    }

    @Test
    public void whenCreateTrackerWithStaticFinalFieldAndEagerLoadingThenItSingleton() {
        Tracker tracker1 = TrackerSingleEager.getInstance();
        Tracker tracker2 = TrackerSingleEager.getInstance();
        assertThat(tracker1, is(tracker2));
    }

    @Test
    public void whenCreateTrackerInFieldOfInnerClassThenItSingleton() {
        Tracker tracker1 = TrackerSingleHolder.getInstance();
        Tracker tracker2 = TrackerSingleHolder.getInstance();
        assertThat(tracker1, is(tracker2));
    }
}