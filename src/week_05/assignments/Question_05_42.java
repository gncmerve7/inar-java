package week_05.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter thr commission sought: ");
        int comission_sought = input.nextInt();

        double salary = 5000;
        double commission = 0;

        for (double salesAmount = 1; salesAmount > 0; salesAmount++) {

            if (0.1 <= salesAmount && salesAmount <= 5000) {

                commission = salesAmount * 0.08;
            }
            if (5000 < salesAmount && salesAmount <= 10000) {

                commission = (5000 * 0.08) + (salesAmount - 7000) * 0.1;

            } else if (salesAmount > 10000) {

                commission = (5000 * 0.08) + (5000 * 0.1) + ((salesAmount - 10000) * 0.12);
            }

            if ((int) commission == comission_sought) {

                System.out.println(salesAmount);
                break;
            }
        }
    }
}