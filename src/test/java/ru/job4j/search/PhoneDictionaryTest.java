package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var foundPersonsList = phones.find("Petr");
        assertThat(foundPersonsList.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByPhoneIs632() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Igor", "Ivanov", "6326161", "Moscow"));
        phones.add(new Person("Sergey", "Petrov", "63283264", "Kursk"));
        var foundPersonsList = phones.find("632");
        assertThat(foundPersonsList.get(0).getName(), is("Igor"));
        assertThat(foundPersonsList.get(1).getName(), is("Sergey"));
    }
}