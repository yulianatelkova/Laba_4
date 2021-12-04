package ru.vsu.amm.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Юлиана Телкова
 * @version 2021.2.1
 */
public class Main {
    /**
     * функция main
     * @param args - аргументы
     * */
    public static void main(String[] args) {
        String csvFilePath = "src\\resources\\foreign_names.csv";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath));
            List<Person> personList = new ArrayList<>();
            PersonFactory personFactory = new PersonFactory();
            DepartmentFactory departmentFactory = new DepartmentFactory();
            String line = bufferedReader.readLine(); // skip first row
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                String[] birthDate = values[3].split("\\.");
                //System.out.println(line);
                Person person = personFactory.getPerson(
                        Long.parseLong(values[0]),
                        values[1],
                        values[2],
                        new Date(
                                Integer.parseInt(birthDate[2]),
                                Integer.parseInt(birthDate[1]),
                                Integer.parseInt(birthDate[0])
                        ),
                        departmentFactory.getDepartment(values[4]),
                        Long.parseLong(values[5])
                );
                personList.add(person);
            }
            for (Person person : personList) {
                System.out.println(person.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}