package week_11.assignments.question_11_02;

public class Student extends Person {
    String classStatus;

    Student() {
    }

    Student(String name, String address, long phone, String email, String classStatus) {
        super(name, address, phone, email);
        this.classStatus = classStatus;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Class Status: " + classStatus;
    }
}