package week_02.assignments;

import java.util.Scanner;

public class Question_02_14 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double pounds = x.nextDouble();
        pounds *= 0.45359237;
        System.out.println("Enter height in inches: ");
        double inches = x.nextDouble();
        inches *= 0.0254;
        double Bmi = pounds / Math.pow(inches, 2);
        System.out.println("BMI is: " + Bmi);

    }
}
