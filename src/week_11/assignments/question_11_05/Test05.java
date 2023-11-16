package week_11.assignments.question_11_05;


public class Test05 {
    public static void main(String[] args) {
        Course course = new Course("SDET");
        course.addStudent("Nisanur Altuntas");
        course.addStudent("Gürkan Serteser");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Deniz");
        course.addStudent("Berkan Eris");
        System.out.println(course.displayBefore());

        course.dropStudent("Nisanur Altuntas");
        course.dropStudent("Gürkan Serteser");
        course.dropStudent("Sinan Cetin");

        System.out.println(course.displayAfter());
    }
}
