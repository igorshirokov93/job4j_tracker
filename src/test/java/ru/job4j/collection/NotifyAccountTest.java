package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenDuplicates() {
        List<Account> accounts = List.of(
                new Account("187114", "Shirokov Igor", "ee67e38eb5"),
                new Account("405523", "Hincu Andrei", "b7052d15c8"),
                new Account("405523", "Hincu Andrei", "b7052d15c8")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("187114", "Shirokov Igor", "ee67e38eb5"),
                        new Account("405523", "Hincu Andrei", "b7052d15c8")
                ));
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}