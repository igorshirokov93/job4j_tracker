package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void sortedByCity() {
        Profiles prof = new Profiles();
        List<Address> addresses = prof.collect(List.of(
                new Profile(new Address("Калининград", "Киевская", 82, 17)),
                new Profile(new Address("Санкт-Петербург", "2-я Советская", 25, 9)),
                new Profile(new Address("Москва", "Тверская", 4, 3)),
                new Profile(new Address("London", "Park Avenue", 91, 69))
        ));
        List<Address> expected = List.of(
                new Address("London", "Park Avenue", 91, 69),
                new Address("Калининград", "Киевская", 82, 17),
                new Address("Москва", "Тверская", 4, 3),
                new Address("Санкт-Петербург", "2-я Советская", 25, 9)
        );
        assertThat(addresses, is(expected));
    }

    @Test
    public void sortedByCityAndDistinct() {
        Profiles prof = new Profiles();
        List<Address> addresses = prof.collect(List.of(
                new Profile(new Address("Москва", "Тверская", 4, 3)),
                new Profile(new Address("Москва", "Тверская", 4, 3)),
                new Profile(new Address("London", "Park Avenue", 91, 69)),
                new Profile(new Address("Санкт-Петербург", "2-я Советская", 25, 9)),
                new Profile(new Address("Санкт-Петербург", "2-я Советская", 25, 9)),
                new Profile(new Address("Калининград", "Киевская", 82, 17))
        ));
        List<Address> expected = List.of(
                new Address("London", "Park Avenue", 91, 69),
                new Address("Калининград", "Киевская", 82, 17),
                new Address("Москва", "Тверская", 4, 3),
                new Address("Санкт-Петербург", "2-я Советская", 25, 9)
        );
        assertThat(addresses, is(expected));
    }
}