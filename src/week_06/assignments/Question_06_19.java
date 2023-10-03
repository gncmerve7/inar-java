package week_06.assignments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is: " + area(side1, side2, side3));
        } else
            System.out.println("Invalid side input!");
    }

    public static boolean isValid(double side1, double side2, double side3) {
        while (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
            return false;
        return true;
    }

    public static double area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2;
        double area = Math.pow((s * (s - s1) * (s - s2) * (s - s3)), 0.5);
        return area;
    }

}
