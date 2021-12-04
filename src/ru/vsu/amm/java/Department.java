package ru.vsu.amm.java;

/**
 * Класс отдела
 */
public class Department {
    private static long autoId = 1;
    private long id;
    private String name;

    /**
     * Создает подразделение по названию
     *
     * @param name - название подразделения
     */
    public Department(String name) {
        this.id = autoId++;
        this.name = name;
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
     * */
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
}