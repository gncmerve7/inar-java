package week_02.assignments;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double drivingDistance = x.nextDouble();
        System.out.println("Enter the miles per gallon: ");
        double milesPerGallon = x.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricesPerGallon = x.nextDouble();
        double cost = (drivingDistance * pricesPerGallon) / milesPerGallon;
        System.out.println("The cost of driving is " + cost);


    }
}
