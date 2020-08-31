package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 31.08.2020.
 */

public class UsageMap {
    public Map<String, String> putItem(String key, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }
}