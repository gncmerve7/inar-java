package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double numE = 0;
        double fakt = 1;
        int count = 0;
        for (double i = 1; i <= 100000; i++) {
            fakt *= i;
            numE += 1 / fakt;
            count++;
            if (count % 10000 == 0) System.out.println("e at i = " + (count) + " is " + (1 + numE));
        }
        System.out.println("Java's e is " + Math.E);
    }
}