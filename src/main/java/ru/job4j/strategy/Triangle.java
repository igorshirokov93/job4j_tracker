package ru.job4j.strategy;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 31.07.2020.
 */

public class Triangle implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}