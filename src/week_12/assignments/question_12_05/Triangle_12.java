package week_12.assignments.question_12_05;

import java.util.Scanner;

public class Triangle_12 {
    Scanner scan = new Scanner(System.in);
    double side1;
    double side2;
    double side3;

    public Triangle_12() throws IllegalTriangleException {
        System.out.println("Enter three sides of a triangle: ");
        this.side1 = scan.nextDouble();
        this.side2 = scan.nextDouble();
        this.side3 = scan.nextDouble();
        if (!isLegal(side1, side2, side3)) {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the remaining side");
        }
    }

    public boolean isLegal(double side1, double side2, double side3) {
        boolean valid = true;
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 || side1 == 0 || side2 == 0 || side3 == 0) {
            return false;
        } else
            return true;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {

        return "Triangle's side1=" + side1 + " side2=" + side2 + " side3=" + side3;

    }
}
