package ru.vsu.amm.java;

import java.util.Date;

/**
 * ����� ��������
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
     * ������� �������� �� �����, ����, ���� ��������, �������������, ��������
     *
     * @param name       - ���
     * @param gender     - ���
     * @param birthDate  - ���� ��������
     * @param department - �������������
     * @param salary     - ��������
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
     * ������� �������� �� ������� ������(id), �����, ����, ���� ��������, �������������, ��������
     *
     * @param id         - id
     * @param name       - ���
     * @param gender     - ���
     * @param birthDate  - ���� ��������
     * @param department - �������������
     * @param salary     - ��������
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
     * ����� ��� ��������� �������� ����
     * @return id
     */
    public long getId() {
        return id;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @param id - ������ �����
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @param name - ���
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @param gender - ���
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @return birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @param birthDate - ���� ��������
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @return department
    public Department getDepartment() {return department;}
     * ����� ��� ��������� �������� ����
     * @param department

    public void setDepartment(Department department) {
        this.department = department;
    }
     */
    /**
     * ����� ��� ��������� �������� ����
     * @return salary
     */
    public long getSalary() {
        return salary;
    }
    /**
     * ����� ��� ��������� �������� ����
     * @param salary - ��������
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }
}