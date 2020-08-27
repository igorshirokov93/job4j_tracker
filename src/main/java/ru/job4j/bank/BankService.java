package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 26.08.2020.
 */

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счёт пользователя по реквизитам. Сначала нужно найти пользователя,
     * а потом получить список счетов этого пользователя и в нём найти нужный счёт.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> account = users.get(user);
            for (Account score : account) {
                if (score.getRequisite().equals(requisite)) {
                    return score;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount) {
            rsl = false;
        } else {
            Account destAccount = findByRequisite(destPassport, destRequisite);
            if (destAccount != null) {
                double value = srcAccount.getBalance() - amount;
                srcAccount.setBalance(value);
                destAccount.setBalance((destAccount.getBalance() + amount));
                rsl = true;
            }
        }
        return rsl;
    }
}