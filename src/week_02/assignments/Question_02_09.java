package week_02.assignments;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter v0, v1 and t: ");
        double v0 = x.nextDouble();
        double v1 = x.nextDouble();
        double t = x.nextDouble();

        double average_acceleration = (v1 - v0) / t;
        System.out.println("The average acceleration is:" + average_acceleration);


    }
}
