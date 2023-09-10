package week_04.assignments;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in dollars and cents: ");
        String amount = input.nextLine();

        double convertedAmountS=Double.valueOf(amount);
         int convertedAmount =(int) (convertedAmountS*100);
        int totalCents = (convertedAmount)/100;
        int remainingCent = convertedAmount%100;
        int quarter = remainingCent / 25;
        remainingCent = remainingCent % 25;
        int dime = remainingCent / 10;
        remainingCent = remainingCent % 10;
        int nickel = remainingCent / 5;
        remainingCent = remainingCent % 5;
        int penny = remainingCent;

        System.out.println("Equivalent in Monetary Units: ");
        System.out.println(totalCents + " dollars");
        System.out.println(quarter + " quarters");
        System.out.println(dime + " dimes");
        System.out.println(nickel + " nickels");
        System.out.println(penny + " pennies");


    }
}

