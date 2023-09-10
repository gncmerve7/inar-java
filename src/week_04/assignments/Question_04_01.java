package week_04.assignments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from center to vertex: ");

        double r = input.nextDouble();
        double lengthOfSide = 2 * r * (Math.sin(Math.PI / 5));
        double areaOfPentagon = (5 * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is " + Math.round(areaOfPentagon * 100) / 100.0);


    }
}
