package week_02.assignments;

import java.util.Scanner;

public class Question_02_19 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        // side formula((𝑥2 − 𝑥1)^2 + (𝑦2 − 𝑦1)^2)^1/2
        double x1 = x.nextDouble();
        double y1 = x.nextDouble();
        double x2 = x.nextDouble();
        double y2 = x.nextDouble();
        double x3 = x.nextDouble();
        double y3 = x.nextDouble();
        double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        double side2 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), 0.5);
        double side3 = Math.pow((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        System.out.println("The area of triangle is " + area);


    }

}
