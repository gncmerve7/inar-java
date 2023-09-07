package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        final double INTEREST_RATE = 0.05 / 12;
        System.out.println("Enter the monthly saving amount: ");
        int savingAmount = x.nextInt();
        double valueOfAccount = savingAmount * (1 + INTEREST_RATE);//FIRST MONTH
        valueOfAccount = (savingAmount + valueOfAccount) * (1 + INTEREST_RATE);//SECOND MONTH
        valueOfAccount = (savingAmount + valueOfAccount) * (1 + INTEREST_RATE);//THIRD MONTH
        valueOfAccount = (savingAmount + valueOfAccount) * (1 + INTEREST_RATE);//FOURTH MONTH
        valueOfAccount = (savingAmount + valueOfAccount) * (1 + INTEREST_RATE);//FIFTH MONTH
        valueOfAccount = (savingAmount + valueOfAccount) * (1 + INTEREST_RATE);//SIXTH MONTH
        System.out.println("After the six month, the account value is: " + valueOfAccount);


    }
}
