package org.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        double salary1 = person1.getSalary();
        double salary2 = person2.getSalary();

        if (salary1 < salary2) {
            return -1;
        } else if (salary1 > salary2) {
            return 1;
        } else {
            return 0;
        }
    }
}
