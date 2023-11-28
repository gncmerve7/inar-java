package week_12.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isDigit = true;

        do {

            try {
                System.out.println("Enter two integers to sum:");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                int sum = num1 + num2;
                System.out.println("Sum of " + num1 + " + " + num2 + " is " + sum);
                isDigit = true;

            } catch (InputMismatchException e) {
                System.out.println("Wrong input!! Please enter again. ");
                isDigit = false;
                scan.nextLine();
            }
        } while (!isDigit);
    }
}
