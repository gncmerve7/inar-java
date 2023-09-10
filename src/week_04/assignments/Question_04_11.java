package week_04.assignments;

import java.util.Scanner;

public class Question_04_11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value(0 to 15): ");
        int value = input.nextInt();
        if (value < 10) {
            System.out.println("The hex value is " + value);
        } else if (10 <= value && value <= 15) {
            char valueOfHex = (char) ('A'+value - 10);// except(0-1-2-3-4-5-6-7-8-9) & include(A-B-C-D-E-F)
            System.out.println("The hex value is " + valueOfHex);
        } else {
            System.out.println(value + " is an invalid input.");
        }
    }
}
