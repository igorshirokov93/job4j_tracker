package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1});
        in.add(new int[]{2, 3});
        List<Integer> expect = List.of(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void whenThreeList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1, 2});
        in.add(new int[]{3, 4, 5});
        in.add(new int[]{6, 7, 8, 9});
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void whenFourList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1, 0});
        in.add(new int[]{7, 4, 5});
        in.add(new int[]{6, 3, 8, 9});
        in.add(new int[]{10, 12});
        List<Integer> expect = List.of(1, 0, 7, 4, 5, 6, 3, 8, 9, 10, 12);
        assertThat(ConvertList.convert(in), is(expect));
    }
}