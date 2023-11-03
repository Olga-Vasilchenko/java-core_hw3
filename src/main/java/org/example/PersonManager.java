package org.example;
import java.util.Date;

public class PersonManager extends Person {
    public PersonManager(String profession, String name, double salary, int age
    ) {
        super(profession, name, salary, age);
    }

    public static void increaseSalary(Person[] people, double amount) {
        for (Person person : people) {
            if (!(person instanceof PersonManager)) {
                person.increaseSalary(amount);
            }
        }
    }
}

