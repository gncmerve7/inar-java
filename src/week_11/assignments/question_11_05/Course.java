package week_11.assignments.question_11_05;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void addStudent(String student) {
        students[numOfStudents] = student;
        numOfStudents++;
    }

    public void dropStudent(String student) {
        students[numOfStudents] = student;
        numOfStudents--;
    }

   // public String display() {
 //       return "After adding student to course: " + getStudents() + "After dropping student to course: " + getStudents();
  //  }
}
