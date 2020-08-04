package ru.job4j.ex;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 4.08.2020.
 */

public class User {

    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}