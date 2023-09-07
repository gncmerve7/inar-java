package week_03.assignments;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = x.nextDouble();
        double b = x.nextDouble();
        double c = x.nextDouble();
        double discriminant = (Math.pow(b, 2) - (4 * a * c));
        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if (discriminant > 0) {
            System.out.println("The equation has two root " + r1 + r2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one roots " + r1);
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }

    }
}
