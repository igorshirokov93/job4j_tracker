package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $singleton.static_final_field.eager_loading$
 * @since 13.08.2020.
 */

public class TrackerSingleEager {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingleEager() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}