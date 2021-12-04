package ru.vsu.amm.java;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс человека
 */
public class PersonFactory {
    private Set<Person> personSet = new HashSet<>();

    /**
     * Этот метод возвращает нового человека, если он не содержится в наборе Person (personSet)
     *
     * @param id         - id
     * @param name       - имя
     * @param gender     - пол
     * @param birthDate  - дата рождения
     * @param department - подразделение
     * @param salary     - зарплата
     *
     * @return person
     */
    public Person getPerson(long id, String name, String gender, Date birthDate, Department department, long salary) {
        for (Person person : personSet) {
            if (person.getId() == id) {
                return person;
            }
        }
        Person person = new Person(id, name, gender, birthDate, department, salary);
        personSet.add(person);
        return person;
    }
}
