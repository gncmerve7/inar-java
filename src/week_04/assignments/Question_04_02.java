package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.println("Enter the point 1 in degrees: ");
        double x1 = input.nextDouble(); //latitude stands for x longtitude for y
        double y1 = input.nextDouble();

        System.out.println("Enter the point 2 in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x1InRadians = Math.toRadians(x1);
        double y1InRadians = Math.toRadians(y1);
        double x2InRadians = Math.toRadians(x2);
        double y2InRadians = Math.toRadians(y2);


        double distance = RADIUS * Math.acos(Math.sin(x1InRadians) * Math.sin(x2InRadians) +
                Math.cos(x1InRadians) * Math.cos(x2InRadians) * Math.cos(y1InRadians - y2InRadians));
        System.out.println("The distance between the two point is " + distance + " km");

    }
}
