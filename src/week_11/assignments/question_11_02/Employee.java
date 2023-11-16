package week_11.assignments.question_11_02;

import java.util.Date;

public class Employee extends Person {
    int officeNum;
    double salary;

    Employee() {
    }

    Employee(String name, String address, long phone, String email, int officeNum, double salary) {
        super(name, address, phone, email);
        this.salary = salary;
        this.officeNum = officeNum;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Office: " + officeNum + "\nSlary: " + salary;
    }
}

