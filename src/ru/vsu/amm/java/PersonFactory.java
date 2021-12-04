package ru.vsu.amm.java;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ����� ��������
 */
public class PersonFactory {
    private Set<Person> personSet = new HashSet<>();

    /**
     * ���� ����� ���������� ������ ��������, ���� �� �� ���������� � ������ Person (personSet)
     *
     * @param id         - id
     * @param name       - ���
     * @param gender     - ���
     * @param birthDate  - ���� ��������
     * @param department - �������������
     * @param salary     - ��������
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
