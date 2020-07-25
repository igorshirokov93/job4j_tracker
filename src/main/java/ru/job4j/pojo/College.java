package ru.job4j.pojo;

import java.util.Date;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 25.07.2020.
 */

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Igor Shirokov");
        student.setGroup("Job4j");
        student.setAdmission(new Date());

        System.out.println(student.getName() + " entered the " + student.getGroup() + " on the " + student.getAdmission());
    }
}