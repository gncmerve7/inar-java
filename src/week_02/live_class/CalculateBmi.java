package week_02.live_class;

import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        System.out.println("Enter your weight in inches and height in pounds: ");
        double weight = input.nextDouble();
        double height = input.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double BMI = weightInKilograms / (heightInMeters*heightInMeters);
        System.out.println("Your BMI is: "+BMI);
        if (BMI<18.5){
            System.out.println("You are underweight.");
        } else if (BMI<25){
            System.out.println("You are normal. ");
        } else if (BMI<30){
            System.out.println("You are overweight");
        } else
            System.out.println("You are obese. ");
    }

}

