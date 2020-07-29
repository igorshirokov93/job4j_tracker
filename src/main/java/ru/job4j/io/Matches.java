package ru.job4j.io;

import java.util.Scanner;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 29.07.2020.
 */

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int count = 1;
        int player = 1;
        System.out.println("Игра началась! Игроки по очереди могут брать от 1 до 3 спичек за один раз.");
        while (matches > 0) {
            System.out.println("Осталось " + matches + " спичек на столе.");
            player = count % 2 == 0 ? 2 : 1;
            System.out.println("Игрок " + player + " берёт:");
            int turn = Integer.valueOf(input.nextLine());
            if (turn <= 3 && turn >= 1) {
                matches = matches - turn;
                count++;
            }
        }
        System.out.println("Победил игрок " + player + "!");
    }
}