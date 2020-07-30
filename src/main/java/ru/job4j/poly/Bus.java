package ru.job4j.poly;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 30.07.2020.
 */

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Осторожно, двери закрываются!");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Количество пассажиров: " + passengers);
    }

    @Override
    public double fill(double fuel) {
        double price = 1.75;
        price = fuel * price;
        return price;
    }
}