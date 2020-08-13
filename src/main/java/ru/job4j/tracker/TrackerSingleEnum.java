package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $singleton.enum.eager_loading$
 * @since 13.08.2020.
 */

public enum TrackerSingleEnum {
    INSTANCE;

    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
    