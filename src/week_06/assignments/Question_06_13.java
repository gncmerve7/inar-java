package week_06.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.printf("%-7s %7s %-1s", "i", "m(i)\n", "---------------\n");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-7s %7.4f \n", i, sumSeries(i));

        }
    }

    public static double sumSeries(int k) {
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i * 1.0 / (i + 1);  //???
        }

        return sum;
    }
}
