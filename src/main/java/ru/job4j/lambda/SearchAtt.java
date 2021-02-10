package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 10.02.2021.
 */

public class SearchAtt {

    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> result = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                result.add(att);
            }
        }
        return result;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> predicate = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getSize() > 100;
            }
        };
        return filter(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> predicate = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return att.getName().contains("bug");
            }
        };
        return filter(list, predicate);
    }

    public static void main(String[] args) {
        List<Attachment> listTest = List.of(
                new Attachment("bug", 205),
                new Attachment("bug", 96),
                new Attachment("fix bug", 47),
                new Attachment("bug 101", 153),
                new Attachment("arsentev", 78),
                new Attachment("petr", 334)
        );
        System.out.println("filterSize :");
        System.out.println(filterSize(listTest));
        System.out.println();
        System.out.println("filterName :");
        System.out.println(filterName(listTest));

    }
}