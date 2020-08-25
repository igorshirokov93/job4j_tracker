package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 25.08.2020.
 */

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }


    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}