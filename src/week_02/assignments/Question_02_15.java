package week_02.assignments;

import java.util.Scanner;

public class Question_02_15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = x.nextDouble();
        double y1 = x.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = x.nextDouble();
        double y2 = x.nextDouble();
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("The distance between the two points is: " + distance);

    }
}
