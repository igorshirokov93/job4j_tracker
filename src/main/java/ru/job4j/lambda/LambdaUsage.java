package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 23.02.2021.
 */

public class LambdaUsage {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("igor", 20),
                new Attachment("petr", 120),
                new Attachment("andrew", 23)
        };

        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + left.getSize() + " : " + right.getSize());
            return left.getSize() - right.getSize();
        };

        Comparator<Attachment> cmpText = (left, right) -> {
            System.out.println("compare text - " + left.getName() + " : " + right.getName());
            return left.getName().compareTo(right.getName());
        };

        Comparator<Attachment> cmpDescSize = (left, right) -> {
            System.out.println("compare length desc - " + left.getName().length() + " : " + right.getName().length());
            return Integer.compare(right.getName().length(), left.getName().length());
        };

        Arrays.sort(atts, comparator);
        Arrays.sort(atts, cmpText);
        Arrays.sort(atts, cmpDescSize);
    }
}