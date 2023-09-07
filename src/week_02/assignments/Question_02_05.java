package week_02.assignments;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the subtotal and gratuity rate:");
        double subtotal = x.nextDouble();
        double gratuity_rate = x.nextDouble();
        double gratuity = (gratuity_rate / 100) * subtotal;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is: " + gratuity + " and total is: " + total);

    }

}
