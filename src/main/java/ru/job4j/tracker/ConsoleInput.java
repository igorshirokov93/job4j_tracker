package ru.job4j.tracker;

import java.util.Scanner;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $4$
 * @since 08.08.2020.
 */

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}