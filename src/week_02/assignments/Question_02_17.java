package week_02.assignments;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature = x.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = x.nextDouble();
        double windChill = ((35.74) + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16)));
        System.out.println("The wind chill index is " + windChill);
    }
}
