package ru.job4j.oop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 07.05.2020.
 */

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic man = new DummyDic();
        String word = man.engToRus("London is the capital of Great Britain");
        System.out.println(word);
    }
}