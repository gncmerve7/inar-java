package week_02.assignments;

import java.util.Scanner;

public class Question_02_20 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        System.out.println("Enter balance and interest rate: ");
        double balance = x.nextDouble();
        double interestRate = x.nextDouble();
        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is: " + interest);


    }
}
