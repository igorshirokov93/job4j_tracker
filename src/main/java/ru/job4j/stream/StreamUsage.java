package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 11.03.2021.
 */

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(-3, 0, 26, -85, 15, -68, 37, -19, 152);
        List<Integer> dest = source.stream().filter(x -> x > 0).collect(Collectors.toList());
        System.out.println(dest);
    }
}