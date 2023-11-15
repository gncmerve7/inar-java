package week_11.assignments.question_11_02;

import java.util.Date;

public class Employee extends Person {
    int officeHours;
    double salary;

    Employee() {
    }

    Employee(String name, String address, long phone, String email, int officeHours, double salary) {
        super(name,address,phone,email);
        this.officeHours = officeHours;
        this.salary = salary;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Work hours: " + officeHours;
    }
}

