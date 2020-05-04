package ru.job4j.oop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 02.05.2020.
 */

public class DummyDic {
    public String engToRus() {
        String eng = "capital";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic man = new DummyDic();
        String say = man.engToRus();
        System.out.println("Неизвестное слово: " + say);
    }
}
