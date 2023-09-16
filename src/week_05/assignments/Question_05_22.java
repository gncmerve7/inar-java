package week_05.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        int loan = input.nextInt();
        System.out.print("Number of years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble();

        double monthlyRate = rate / 1200;
        double monthlyPay = (loan * monthlyRate) / (1 - (1 / Math.pow(1 + monthlyRate, years * 12)));
        double totalPay = monthlyPay * years * 12;
        double balance = loan;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPay);
        System.out.printf("Monthly Payment: %.2f\n", totalPay);
        System.out.println("Payment#\t Interest\t  Principal\t  Balance");

        for (int i = 1; i <= 12; i++) {
            double interest = rate / 1200 * balance;
            double principal = monthlyPay - interest;
            balance += -principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,
                    principal, balance);
        }
    }
}