package ru.job4j.collection;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UsageMapTest {
    @Test
    public void testPutItem() {
        UsageMap uMap = new UsageMap();
        Map<String, String> expected = Map.of("freelancerigor@yandex.ru", "Shirokov Igor Vladislavovich");
        Map<String, String> result = uMap.putItem("freelancerigor@yandex.ru", "Shirokov Igor Vladislavovich");
        assertThat(result, is(expected));
    }
}