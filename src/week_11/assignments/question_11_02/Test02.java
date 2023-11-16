package week_11.assignments.question_11_02;

public class Test02 {
    public static void main(String[] args) {

        Person person = new Person("Gurol", "Istanbul", 9999999999L, "gurol@inar.com");
        Person student = new Student("Nafiz", "Ankara", 3333333333L, "nafiz@gmail.com", "0");
        Person employee = new Employee("Recai", "Istanbul", 6666666666L, "recai@gmail.com", 910, 60000);
        Person faculty = new Faculty("Serhat", "Texas, Dallas", 4133333333L, "serhat@inar.com", 101, 50000, "10am to 6pm", "manager");
        Person staff = new Staff("Elon", "California", 2030222220, "elon@musk.com", 12, 6005000, "CEO");

        System.out.println("PERSON");
        System.out.println(person.toString());

        System.out.println("\nSTUDENT");
        System.out.println(student.toString());

        System.out.println("\nEMPLOYEE");
        System.out.println(employee.toString());

        System.out.println("\nFACULTY");
        System.out.println(faculty.toString());

        System.out.println("\nSTAFF");
        System.out.println(staff.toString());
    }

}
