package ru.job4j.collection;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissedDepartmentsThanAdd() {
        List<String> input = List.of("K1/SK1/SSK2");
        List<String> expect = List.of("K1", "K1/SK1", "K1/SK1/SSK2");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFullThanNonChange() {
        List<String> input = List.of("K1", "K1/SK1", "K1/SK1/SSK1");
        List<String> expect = List.of("K1", "K1/SK1", "K1/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }
}