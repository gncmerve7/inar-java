package week_03.assignments;

import java.util.Scanner;

public class Question_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        if ((a * d) - (b * c) == 0) {
            System.out.println("The equation has no solution.");

        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " y is " + y);
        }
    }
}
