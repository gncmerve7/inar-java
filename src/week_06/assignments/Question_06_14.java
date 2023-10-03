package week_06.assignments;

public class Question_06_14 {
    public static void main(String[] args) {

        System.out.printf("%2s %23s\n", "i", "m(i)\n --------------");
        int i = 1;
        while (i <= 901) {
            System.out.printf("%2d %8.4f\n", i, m(i));
            i += 100;
        }
    }

    public static double m(int k) {
        double formula = 0;
        for (int i = 1; i <= (double) k; i++) {
            formula += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return formula;
    }
}