package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса.
 *
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $4$
 * @since 28.03.2021.
 */

public class BankService {
    /**
     * Класс связывает владельца(User) с его счетами(Account).
     * User хранится в ключе
     * В значении хранится список Account
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет User в список, если в списке такого User еще нет
     *
     * @param user принимает в качестве параметра User,
     *             который должен быть добавлен в списке
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый Account в список счетов User'а
     * Сначала ищет владельца счета в списке users
     * по его паспортным данным (String passport)
     * Если User найден, и добавляемого счёта в списке его счетов нет,
     * то производится добавление счёта в список.
     *
     * @param passport принимает параметром паспортные данные в формате строки
     * @param account  принимает параметром счёт, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет владельца счёта в списке users по его паспортным данным
     *
     * @param passport принимает параметром паспортные данные в формате строки
     * @return возвращает User, если владелец счета найден в перечне users, или null
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет по реквизитам и паспортным данным владельца счета
     *
     * @param passport  принимает параметром паспортные данные в формате строки
     * @param requisite принимает параметром реквизиты в формате строки
     * @return Если счет найден, возвращает Account. Если не найден, то null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод осуществляет перевод между счетами
     *
     * @param srcPassport   - паспортные данные владельца,
     *                      со счета которого осуществляется перевод
     * @param srcRequisite  - реквизиты счета, с которого осуществляется перевод
     * @param destPassport  - паспортные данные владельца,
     *                      на счет которого осуществляется перевод
     * @param destRequisite - реквизиты счета, на который осуществляется перевод
     * @param amount        - сумма перевода
     * @return true, если перевод успешен, в противном случае false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount == null || srcAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return rsl;
    }
}