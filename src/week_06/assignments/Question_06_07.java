package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.printf("%4s %20s \n", "Years", "Future value");

        for (int i = 1; i <= year; i++) {
            System.out.printf("%-7d \t\t %-10.2f\n", i, futureValue(investAmount, interestRate, i));
        }
    }

    public static double futureValue(double amount, double rate, int years) {
        double valueOfFuture = amount * Math.pow(1 + rate / 1200, years * 12);
        return valueOfFuture;
    }
}
