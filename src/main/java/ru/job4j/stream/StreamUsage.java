package ru.job4j.stream;

import java.util.Objects;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 22.03.2021.
 */

public class StreamUsage {
    public static class Task {
        public final String name;
        public final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Task)) {
                return false;
            }
            Task task = (Task) o;
            return spent == task.spent
                    && Objects.equals(name, task.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, spent);
        }
    }
}