package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 10.04.2021.
 * Класс Analyze получает статистику по аттестатам.
 */

public class Analyze {

    /**
     * Вычисляет общий средний балл.
     *
     * @param stream преобразовывает в поток объекты класса Subject.
     * @return средний балл по предмету.
     */

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average().orElse(0D);
    }

    /**
     * вычисляет средний балл ученика по его предметам
     *
     * @param stream преобразовает в поток объекты класса Tuple
     * @return Возвращает список из объекта Tuple (имя ученика и средний балл).
     */

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(
                                pupil.getName(),
                                pupil.getSubjects()
                                        .stream()
                                        .mapToInt(Subject::getScore)
                                        .average().orElse(0D)
                        )
                )
                .collect(Collectors.toList());
    }

    /**
     * вычисляет средний балл по всем предметам для каждого ученика.
     *
     * @param stream преобразовывает в поток объекты класса Subject
     * @return Возвращает список из объекта Tuple (название предмета и средний балл).
     */

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(
                        pupil -> pupil.getSubjects().stream())
                .collect(
                        Collectors.groupingBy(Subject::getName,
                                Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(pupil -> new Tuple(
                        pupil.getKey(),
                        pupil.getValue()))
                .sorted(Comparator.comparing(Tuple::getName).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Лучшим считается ученик с наибольшим баллом по всем предметам.
     *
     * @param stream поток
     * @return возвращает лучшего ученика.
     */

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(
                                pupil.getName(),
                                pupil.getSubjects()
                                        .stream()
                                        .mapToInt(Subject::getScore)
                                        .sum()
                        )
                )
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }

    /**
     * Возвращает предмет с наибольшим баллом для всех студентов.
     *
     * @param stream поток
     * @return Возвращает объект Tuple
     * (имя предмета, сумма баллов каждого ученика по этому предмету)
     */

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(
                        pupil -> pupil.getSubjects().stream())
                .collect(
                        Collectors.groupingBy(Subject::getName,
                                Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(pupil -> new Tuple(
                        pupil.getKey(),
                        pupil.getValue()))
                .sorted(Comparator.comparing(Tuple::getName).reversed())
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
}