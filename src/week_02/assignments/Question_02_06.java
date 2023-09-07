package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = x.nextInt();
        int firstDigit = number % 10;
        int secondDigit = (number / 10) % 10;

        int thirdDigit = (number / 100) % 10;
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println("The sum of digits is: " + sumOfDigits);


    }
}
