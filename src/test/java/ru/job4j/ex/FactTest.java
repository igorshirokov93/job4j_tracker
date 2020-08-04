package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus1toFail() {
        Fact.calc(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus3toFail() {
        Fact.calc(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus4toFail() {
        Fact.calc(-4);
    }
}