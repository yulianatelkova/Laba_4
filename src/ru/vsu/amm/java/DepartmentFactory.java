package ru.vsu.amm.java;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс отдела
 */
public class DepartmentFactory {

    private Set<Department> departmentSet = new HashSet<>();

    /**
     * Этот метод возвращает новый отдел, если он не содержится в наборе подразделений (departmentSet)
     *
     * @param name - название подразделения
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