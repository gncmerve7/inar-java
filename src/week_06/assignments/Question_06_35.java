package week_06.assignments;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        area(side);
    }

    public static double area(double s) {
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of pentagon is " + area);

        return area;
    }
}
