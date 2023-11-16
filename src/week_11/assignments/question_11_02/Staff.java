package week_11.assignments.question_11_02;

public class Staff extends Employee {
    String title;

    Staff() {
    }

    Staff(String name, String address, long phone, String email, int officeNum, double salary, String title) {
        super(name, address, phone, email, officeNum, salary);

        this.title = title;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Title: " + title;
    }
}
