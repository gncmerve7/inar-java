package week_02.assignments;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter amount as integer: ");
        int amount = x.nextInt();
        int dollar = amount / 100;
        int remainingCent = amount % 100;
        int quarter = remainingCent / 25;
        remainingCent = remainingCent % 25;   //remainingCent %= 25; shorthand gosterim
        int dime = remainingCent / 10;
        remainingCent = remainingCent % 10; //remainingCent %= 10; shorthand gosterim
        int nickel = remainingCent / 5;
        remainingCent = remainingCent % 5; //remainingCent %= 5; shorthand gosterim
        int penny = remainingCent;

        System.out.println("Your amount " + amount + "consist of; ");
        System.out.println(dollar + " dollars");
        System.out.println(quarter + " quarters");
        System.out.println(dime + " dimes");
        System.out.println(nickel + " nickels");
        System.out.println(penny + " pennies");


    }
}
