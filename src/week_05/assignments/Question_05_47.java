package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 12 digit of an ISBN-13 as a string: ");
        String isbn = input.nextLine();

        int sum1 = 0;
        int sum2 = 0;
        int d13 = 0;
        for (int i = 0; i <= 11; i += 2) {
            int d = Integer.valueOf(isbn.substring(i, i + 1));
            sum1 += d;
        }
        for (int j = 1; j <= 12; j += 2) {
            int d = Integer.valueOf(isbn.substring(j, j + 1));
            sum2 += 3 * d;
        }

        d13 = 10 - (sum1 + sum2) % 10;

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
        } else if (d13 == 10) {
            System.out.print("The ISBN-13 number is " + isbn + "0");
        } else {
            System.out.print("The ISBN-13 number is " + isbn + "" + d13);
        }
    }
}