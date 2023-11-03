package org.example;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new PersonManager("начальник отдела","Николаев Алексей Петрович", 65000, 41));
        personList.add(new Person("менеджер", "Логинова Ирина Вячеславовна", 50000, 35));
        personList.add(new Person("менеджер","Петрова Наталья Сергеевна", 50000, 37));
        personList.add(new Person("менеджер","Ефремов Илья Семенович", 50000, 43));
        personList.add(new Person("менеджер","Патрушева Ольга Александровна", 50000, 28));

        System.out.println("Список сотрудников: ");
        for (Person person : personList) {
            System.out.println(person);
        }

        PersonManager.increaseSalary(personList.toArray(new Person[0]), 2000);
        System.out.println();
        System.out.println("Заработная плата после повышения: ");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

}
