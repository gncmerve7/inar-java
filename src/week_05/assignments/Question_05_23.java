package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {
        double sumRight = 0;
        double sumLeft = 0;
        for (double i = 1; i <= 50000; i++) {
            sumLeft += (1 / i);
        }
        for (double j = 50000; j >= 1; j--) {
            sumRight += (1 / j);
        }

        System.out.println("Summation of series from left to right: " + sumLeft);
        System.out.println("Summation of series from right to left: " + sumRight);
        System.out.println("Summation of the series right to left - Summation of the series left to right: " + (sumRight - sumLeft));

    }
}
