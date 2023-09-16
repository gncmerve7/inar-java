package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        int loan = input.nextInt();
        System.out.print("Number of years: ");
        int years = input.nextInt();
        System.out.println("Interest Rate\t Monthly Payment\t Total Payment");

        for (double rate = 5; rate <= 8; rate += 0.125) {
            double intRate = rate / 1200;
            double monthlyPay = (loan * intRate) / (1 - (1 / Math.pow(1 + intRate, years * 12)));
            double totalPay = monthlyPay * years * 12;
            System.out.printf("%5.3f ", rate);
            System.out.printf("%20.2f\t", monthlyPay);
            System.out.printf("%20.2f\n", totalPay);
        }

    }
}
