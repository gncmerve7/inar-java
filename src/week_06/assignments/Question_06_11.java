package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.printf("%8s %14s ", "SalesAmount", " Comission\n");
        for (double i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-8.0f %13.1f \n ", i, computeComission(i));
        }
    }

    public static double computeComission(double salesAmount) {
        double comission = 0;
        if (salesAmount <= 5000) {
            comission = salesAmount * 0.08;
        } else if (salesAmount > 5000 && salesAmount <= 10000) {
            comission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
        } else {
            comission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * .12;
        }
        return comission;
    }
}
