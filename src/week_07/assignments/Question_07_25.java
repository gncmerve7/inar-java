package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a, b, c: ");
        double[] values = new double[3];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        roots(values);
    }

    public static void roots(double[] values) {

        double discriminant = (Math.pow(values[1], 2)) - (4 * values[0] * values[2]);

        if (discriminant > 0) {
            double root[] = new double[2];
            root[0] = (-values[1] + Math.sqrt(discriminant)) / 2 * values[0];
            root[1] = (-values[1] - Math.sqrt(discriminant)) / 2 * values[0];
            System.out.println("The number of real roots: " + root.length);
            System.out.println("The equation has two roots." +
                    root[0] + " and " + root[1]);
        } else if (discriminant == 0) {
            double root[] = new double[1];
            root[0] = (((-1) * values[1]) + (Math.pow(discriminant, 0.5))) / (2 * values[0]);
            System.out.println("The number of real roots: " + root.length);
            System.out.println("The equation has one root." + root[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}