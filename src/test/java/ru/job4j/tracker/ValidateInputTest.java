package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInputText() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
        /** Тест проверяет, что переменная selected содержит валидное значение ввода - цифру 1 */
    }

    @Test
    public void whenInvalidInputText1() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        String expected = "Please enter validate data again." + System.lineSeparator();
        int selected = input.askInt("Enter menu:");
        assertThat(out.toString(), is(expected));
        /** Этим тестом мы проверяем, что при вводе значения была допущена ошибка,
         * в out попало сообщение об ошибке и мы проверяем что это за сообщение.
         * Проще говоря, тест проверяет если вместо числа вводим текст */
    }
}