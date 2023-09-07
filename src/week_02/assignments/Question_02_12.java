package week_02.assignments;

import java.util.Scanner;

public class Question_02_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        //double RunwayLength = (speed * speed) /(2 * acceleration);
        double RunwayLength = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is: " + RunwayLength);
        // ya da System.out.println("The minimum runway length for this airplane is: "+ (float)RunwayLength);


    }
}
