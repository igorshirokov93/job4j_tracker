package ru.job4j.inheritance;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 24.07.2020.
 */

public class HtmlReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" +
                "<br/>" +
                "<span>" + body + "</span>";
    }
}