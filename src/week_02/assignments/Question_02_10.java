package week_02.assignments;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double WeightofWater = x.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double InitialTemperature = x.nextDouble();
        System.out.print("Enter the final temperature: ");
        double FinalTemperature = x.nextDouble();
        double q = WeightofWater * (FinalTemperature - InitialTemperature) * 4184;
        System.out.println("The energy needed is " + q);
    }


}
