package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 10.03.2021.
 */

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = x -> x.getAddress().contains(key)
                || x.getName().contains(key)
                || x.getPhone().contains(key)
                || x.getSurname().contains(key);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}