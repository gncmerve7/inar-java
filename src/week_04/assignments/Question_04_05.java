package week_04.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.println("Enter the length of side: ");
        double lengthOfSide = input.nextDouble();

        double area = (numberOfSides * Math.pow(lengthOfSide, 2)) / (4 * (Math.tan(Math.PI / numberOfSides)));

        System.out.println("The area of polygon is " + area);


    }
}
