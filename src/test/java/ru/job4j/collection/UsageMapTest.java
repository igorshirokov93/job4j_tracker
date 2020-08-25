package ru.job4j.collection;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UsageMapTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        UsageMap.main(null);
        String ln = System.lineSeparator();
        String expected = "freelancerigor@yandex.ru = Shirokov Igor Vladislavovich" + ln;
        assertThat(out.toString(), is(expected));
    }
}