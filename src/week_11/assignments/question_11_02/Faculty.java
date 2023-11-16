package week_11.assignments.question_11_02;

public class Faculty extends Employee {
    int office;
    String officeHours;
    String rank;

    Faculty() {
    }

    Faculty(String name, String address, long phone, String email, int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.rank = rank;
        this.officeHours = officeHours;

    }

    public String toString() {
        System.out.println(super.toString());
        return "OfficeHours:" + officeHours + "\nRank: " + rank;
    }
}
