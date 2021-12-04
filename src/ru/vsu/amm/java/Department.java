package ru.vsu.amm.java;

/**
 * ����� ������
 */
public class Department {
    private static long autoId = 1;
    private long id;
    private String name;

    /**
     * ������� ������������� �� ��������
     *
     * @param name - �������� �������������
     */
    public Department(String name) {
        this.id = autoId++;
        this.name = name;
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
     * */
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
}