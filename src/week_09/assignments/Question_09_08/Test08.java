package week_09.assignments.Question_09_08;

public class Test08 {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan fan1 = new Fan(FAST, true, 10, "yellow");
        Fan fan2 = new Fan(MEDIUM, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println("------------------------------------");
        System.out.println(fan2.toString());
    }

}
