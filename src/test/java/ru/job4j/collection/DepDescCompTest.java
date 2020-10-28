package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepDescCompTest {

    @Test
    public void whenDownDepartmentGoBefore() {
        int rsl = new DepDescComp().compare("K2/SK1/SSK2", "K2/SK1/SSK1");
        assertTrue(rsl > 0);
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare("K2", "K2/SK1");
        assertTrue(rsl < 0);
    }

    @Test
    public void whenDifferentDepartmentsUp() {
        int rsl = new DepDescComp().compare("K1/SK1/SSK2", "K2/SK1/SSK1");
        assertTrue(rsl > 0);
    }

    @Test
    public void whenDifferentDepartmentsDown() {
        int rsl = new DepDescComp().compare("K2/SK1", "K1/SK1/SSK2");
        assertTrue(rsl < 0);
    }
}