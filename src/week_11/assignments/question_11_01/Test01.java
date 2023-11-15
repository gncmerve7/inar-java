package week_11.assignments.question_11_01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        System.out.println("Enter the three side of the triangle:");
        Scanner scan = new Scanner(System.in);
        double side1 = scan.nextInt();
        double side2 = scan.nextInt();
        double side3 = scan.nextInt();

        GeometricObject y = new Triangle(side1, side2, side3);

        System.out.println("Enter a color:");

        y.color = scan.next();
        y.filled = true;

        System.out.println("Area: " + y.getArea());
        System.out.println("Perimeter: " + y.getPerimeter());
        System.out.println(y.toString());

    }
}
