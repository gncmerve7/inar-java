package week_02.assignments;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = x.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = x.nextDouble();
        interestRate = interestRate / (12 * 100);  //  interestRate /= 1200 shorthand gosterim
        System.out.println("Enter number of years ");
        int numberOfYears = x.nextInt();
        double futurelInvestmentValue = (investmentAmount) * Math.pow(1 + interestRate, numberOfYears * 12);
        System.out.println("Accumulated value is: " + futurelInvestmentValue);

    }
}
