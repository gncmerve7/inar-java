package week_04.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name : ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week : ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate : ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate : ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate : ");
        double stateTax = input.nextDouble();

        double grossPay = hours * payRate;
        double federalAmount = grossPay * federalTax;
        double stateAmount = grossPay * stateTax;
        double total = federalAmount + stateAmount;
        double netPay = grossPay - total;
        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay rate: " + payRate);
        System.out.println("Gross pay: " + grossPay);
        System.out.println("Federal Witholding: " + federalAmount);
        System.out.println("State Witholding: " + stateAmount);
        System.out.println("Total deduction: " + total);
        System.out.printf("Net Pay: $%3.2f\n" ,netPay);


    }
    }
