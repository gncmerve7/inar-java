package week_04.assignments;

import java.util.Scanner;

public class Question_04_12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");

        String digit = input.nextLine();

        //if (digit == "A" || digit == "B" || digit == "C" || digit == "D" || digit == "E" || digit == "F") { // ??????????

        int temp = Integer.parseInt(digit, 16); //converting from string to integer based hex

        String binaryValue = Integer.toString(temp, 2); // converting from based hex to based binary

        System.out.println("The binary value is " + binaryValue);

        //}else
        // System.out.println(digit+" is an invalid input.");

    }
}
