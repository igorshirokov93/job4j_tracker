package ru.job4j.encapsulation;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 24.07.2020.
 */

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Приватные методы используются для внутренней логики.
     * Метод search подготавливает данные и результат его работы доступен из метода
     * public String getProperty(String key) {
     * который в свою очередь может так же внести свои коррективы в результат работы приватного метода
     */
    private String search(String key) {
        return key;
    }
}