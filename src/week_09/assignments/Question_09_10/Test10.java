package week_09.assignments.Question_09_10;

public class Test10 {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(1, 3, 1);
        QuadraticEquation q2 = new QuadraticEquation(1, 2, 1);
        QuadraticEquation q3 = new QuadraticEquation(1, 2, 3);
        System.out.println(q1.displayRoots());
        System.out.println(q2.displayRoots());
        System.out.println(q3.displayRoots());

    }
}
