package week_05.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double totalValue = 0;
        System.out.println("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();
        System.out.println("Enter the number of months: ");
        int numOfMonth = input.nextInt();

        for (int months = 1; months <= numOfMonth; months++) {
            totalValue = (amount + totalValue) * (1 + (interestRate / 1200));

        }
        System.out.printf("Amount in saving account after %d months: $%.2f", numOfMonth, totalValue);

    }
}
