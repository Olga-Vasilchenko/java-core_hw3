package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String profession;
    private String name;
    private double salary;
    private int age;
    public Person(String profession, String name, double salary, int age) {
        this.profession = profession;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    SimpleDateFormat formatted = new SimpleDateFormat("YYY-MM-dd");

    {
        Date date1 = new Date(2022, 3, 12);
        Date date2 = new Date(2022, 3, 12);
        String formatted1 = formatted.format(date1);
        String formatted2 = formatted.format(date2);
        {
            if (date1.equals(date2)) ;
            System.out.println("Обе даты равны");
        }
        if (date1.after(date2));
        System.out.println(String.format("%s after before %s", formatted1, formatted2));
        if (date1.before(date2));
        System.out.println(String.format("%s comes before %s", formatted1, formatted2));
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    @Override
    public String toString() {
        return ("Должность: " + profession +
                ", ФИО: " + name +
                ", заработная плата: " + salary +
                ", возраст: " + age);
    }
}