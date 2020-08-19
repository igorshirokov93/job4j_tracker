package ru.job4j.search;

import java.util.LinkedList;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 19.08.2020.
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод вставляет элемент в нужную позицию.
     * Позиция определяет по полю приоритет.
     *
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                index++;
                break;
            }

        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}