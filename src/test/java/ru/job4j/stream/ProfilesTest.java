package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void register() {
        Profiles func = new Profiles();
        List<Address> expect = List.of(
                new Address("London", "Park Avenue", 91, 69),
                new Address("Москва", "Тверская", 4, 3),
                new Address("Санкт-Петербург", "2-я Советская", 25, 9),
                new Address("Калининград", "Киевская", 82, 17)
        );
        List<Profile> input = expect.stream()
                .map(Profile::new)
                .collect(Collectors.toList());
        List<Address> rsl = func.collect(input);
        assertThat(rsl, is(expect));
    }
}