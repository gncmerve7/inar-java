package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = input.nextInt();
        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0)
                System.out.print(divisor + " ");

            }
        }
    }

