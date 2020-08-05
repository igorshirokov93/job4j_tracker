package ru.job4j.ex;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 4.08.2020.
 */

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Пользователь: " + login + " - не найден!");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Имя пользователя состоит менее чем из трех символов!");
        }
        if (!user.isValid()) {
            throw new UserInvalidException("Пользователь не валидный!");
        }
        return true;
    }


    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException en) {
            en.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}