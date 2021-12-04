package ru.vsu.amm.java;

import java.util.HashSet;
import java.util.Set;

/**
 * ����� ������
 */
public class DepartmentFactory {

    private Set<Department> departmentSet = new HashSet<>();

    /**
     * ���� ����� ���������� ����� �����, ���� �� �� ���������� � ������ ������������� (departmentSet)
     *
     * @param name - �������� �������������
     * @return department
     */
    public Department getDepartment(String name) {
        for (Department department : departmentSet) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        Department department = new Department(name);
        departmentSet.add(department);
        return department;
    }
}