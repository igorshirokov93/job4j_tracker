package ru.job4j.stream;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 02.04.2021.
 */

public class Worker {
    private String name;

    private String gender;

    private byte age;

    private String manufactory;

    private int personnel;

    private int standing;

    private double salary;

    @Override
    public String toString() {
        return "Worker{"
                + "name='" + name + '\''
                + ", gender='" + gender + '\''
                + ", age=" + age
                + ", manufactory='" + manufactory + '\''
                + ", personnel=" + personnel
                + ", standing=" + standing
                + ", salary=" + salary
                + '}';
    }

    static class Builder {
        private String name;
        private String gender;
        private byte age;
        private String manufactory;
        private int personnel;
        private int standing;
        private double salary;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildManufactory(String manufactory) {
            this.manufactory = manufactory;
            return this;
        }

        Builder buildPersonnel(int personnel) {
            this.personnel = personnel;
            return this;
        }

        Builder buildStanding(int standing) {
            this.standing = standing;
            return this;
        }

        Builder buildSalary(double salary) {
            this.salary = salary;
            return this;
        }

        Worker build() {
            Worker worker = new Worker();
            worker.name = name;
            worker.gender = gender;
            worker.age = age;
            worker.manufactory = manufactory;
            worker.personnel = personnel;
            worker.standing = standing;
            worker.salary = salary;
            return worker;
        }

        public static void main(String[] args) {
            Worker worker = new Builder().buildName("Igor")
                    .buildGender("male")
                    .buildAge((byte) 27)
                    .buildManufactory("KINEF")
                    .buildPersonnel(12039)
                    .buildStanding(2)
                    .buildSalary(28)
                    .build();
            System.out.println(worker);
        }
    }
}