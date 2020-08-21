package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats milk and a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }

    @Test
    public void isEquals1() {
        String origin = "We are going to visit Greece and Italy";
        String text = "We are going to visit Italy and Greece";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void isNotEquals1() {
        String origin = "Yesterday I learned Java Collections Framework";
        String text = "Java Collections Framework was learned by me";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}