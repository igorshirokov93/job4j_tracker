package ru.job4j.ex;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 4.08.2020.
 */

public class FindMaxLenght {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}