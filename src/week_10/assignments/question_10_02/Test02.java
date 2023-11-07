package week_10.assignments.question_10_02;

public class Test02 {
    public static void main(String[] args) {
        Bmi person1 = new Bmi("Kim Yang", 18, 145, 70);
        Bmi person2 = new Bmi("Susan King", 18, 215, 70);
        System.out.println(person1.getStatus());
        System.out.println(person2.getStatus());
    }
}
