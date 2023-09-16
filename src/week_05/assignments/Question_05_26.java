package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double numE = 0;
        double fakt = 0;
        int count = 0;
        for (int i = 100000; i >= 2; i--) {
            fakt *= i;
            (numE) += 1 + 1 / fakt;
            count++;
            if (i == 10000) {
                System.out.println(numE);
            }
        }
    }
}