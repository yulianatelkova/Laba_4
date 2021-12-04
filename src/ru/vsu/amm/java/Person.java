package ru.vsu.amm.java;

import java.util.Date;

/**
 * Класс человека
 */
public class Person {
    private static long autoId;
    private long id;
    private String name;
    private String gender;
    private Date birthDate;
    private Department department;
    private long salary;

    /**
     * Создает человека по имени, полу, дате рождения, подразделению, зарплате
     *
     * @param name       - имя
     * @param gender     - пол
     * @param birthDate  - дата рождения
     * @param department - подразделение
     * @param salary     - зарплата
     */
    public Person(String name, String gender, Date birthDate, Department department, long salary) {
        this.id = autoId++;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Создает человека по личному номеру(id), имени, полу, дате рождения, подразделению, зарплате
     *
     * @param id         - id
     * @param name       - имя
     * @param gender     - пол
     * @param birthDate  - дата рождения
     * @param department - подразделение
     * @param salary     - зарплата
     */
    public Person(long id, String name, String gender, Date birthDate, Department department, long salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.department = department;
        this.salary = salary;

        autoId = Math.max(id + 1, autoId);
    }

    /**
     * Метод для получения значения поля
     * @return id
     */
    public long getId() {
        return id;
    }
    /**
     * Метод для установки значения поля
     * @param id - личный номер
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * Метод для получения значения поля
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Метод для установки значения поля
     * @param name - имя
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Метод для получения значения поля
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * Метод для установки значения поля
     * @param gender - пол
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Метод для получения значения поля
     * @return birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
    /**
     * Метод для установки значения поля
     * @param birthDate - дата рождения
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * Метод для получения значения поля
     * @return department
    public Department getDepartment() {return department;}
     * Метод для установки значения поля
     * @param department

    public void setDepartment(Department department) {
        this.department = department;
    }
     */
    /**
     * Метод для получения значения поля
     * @return salary
     */
    public long getSalary() {
        return salary;
    }
    /**
     * Метод для установки значения поля
     * @param salary - зарплата
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }
}