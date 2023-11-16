package week_11.assignments.question_11_05;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<String> students = new ArrayList<>(100);
    int numOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numOfStudents++;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numOfStudents--;
    }

    public String displayBefore() {
        return "Before dropping student to " + courseName + " course: \n" + students + "\nNum of students: " + numOfStudents;
    }

    public String displayAfter() {
        return "After dropping student from " + courseName + " course: \n" + students + "\nNum of students: " + numOfStudents;
    }
}
