package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * Departments - класс-справочник подразделений
 *
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 28.10.2020.
 */

public class Departments {

    /**
     * Метод для добавления недостающих подразделений
     *
     * @param deps - массив строк с кодами подразделений
     * @return - список с полной иерархией подразделений в возрастающем порядке
     */
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        List<String> rsl = new ArrayList<>(tmp);
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    tmp.add(start += el);
                } else {
                    tmp.add(start += "/" + el);
                }
            }
        }
        rsl.addAll(tmp);
        rsl.sort(Comparator.naturalOrder());
        return rsl;
    }

    /**
     * Метод для сортировки подразделений по возрастанию
     *
     * @param orgs - список подразделений
     * @return - список подразделений, отсортированный в возрастающем порядке
     */
    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    /**
     * Метод для сортировки подразделений по убыванию
     *
     * @param orgs - список подразделений
     * @return - список подразделений, отсортированный в убывающем порядке
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}