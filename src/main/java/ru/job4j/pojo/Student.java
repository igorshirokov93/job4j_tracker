package ru.job4j.pojo;

import java.util.Date;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 25.07.2020.
 */

public class Student {
    private String name;
    private String group;
    private Date admission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getAdmission() {
        return admission;
    }

    public void setAdmission(Date admission) {
        this.admission = admission;
    }
}