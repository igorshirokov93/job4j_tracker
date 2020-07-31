package ru.job4j.strategy;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 31.07.2020.
 */

public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}
