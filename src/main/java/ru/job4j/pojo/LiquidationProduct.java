package ru.job4j.pojo;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 7.08.2020.
 */

public final class LiquidationProduct {  //final чтобы класс нельзя было наследовать
    private Product product;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}