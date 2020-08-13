package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $singleton.static_field.lazy_loading$
 * @since 13.08.2020.
 */

public class TrackerSingleLazy {
    private static Tracker instance;

    private TrackerSingleLazy() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}