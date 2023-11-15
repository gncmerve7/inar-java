package week_11.assignments.question_11_02;

public class Faculty extends Employee {
    int office;
    String rank;

    Faculty() {
    }

    Faculty(String name, String address, long phone, String email, int office, double salary, String rank) {
        super(name, address, phone, email, office, salary);
        this.office = office;
        this.rank = rank;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Office no: " + office + "\nRank: " + rank;
    }
}
