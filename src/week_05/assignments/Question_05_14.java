package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int count = 0;
        for (int gcd = 1; gcd <= (num1 ^ num2); gcd++) {
            if (num1 % gcd == 0 && num2 % gcd == 0)
                count = gcd;
        }
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + count);
    }
}