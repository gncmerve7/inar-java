package week_05.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeNum = 0;
        int positiveNum = 0;
        int sumOfNum = 0;
        int count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        while (number != 0) {
            if (number < 0) {
                negativeNum++;
            } else
                positiveNum++;
            sumOfNum += number;
            count++;

            System.out.print("Enter an integer, the input ends if it is 0: ");
            number = input.nextInt();
        }

        double avarage = sumOfNum / count;


        System.out.println("The number of positives is: " + positiveNum + "\nNumber of negatives is: "
                + negativeNum + "\nThe total is: " + sumOfNum + "\nThe average is: " + avarage);

    }
}
