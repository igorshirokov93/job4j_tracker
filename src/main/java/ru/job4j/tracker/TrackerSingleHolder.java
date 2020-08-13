package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $singleton.private_static_final_class.lazy_loading$
 * @since 13.08.2020.
 */

public class TrackerSingleHolder {
    private TrackerSingleHolder() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}