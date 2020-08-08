package ru.job4j.tracker;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 7.08.2020.
 */

public class ValidateInput implements Input {

    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }

    @Override
    public int askInt(String question, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question, max);
                invalid = false;
            } catch (IllegalStateException moe) {
                out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}