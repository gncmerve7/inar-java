package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimial interger: ");
        int numDeci = input.nextInt();
        char reverseOfNum = ' ';
        String numOct = "";

        for (int remaining = numDeci; remaining > 0; remaining /= 8) {
            numOct += (remaining % 8);
        }
        System.out.print("The octal value of " + numDeci + " is: ");

        for (int k = (numOct.length() - 1); k >= 0; k--) {
            reverseOfNum = numOct.charAt(k);

            System.out.print(reverseOfNum);

        }
    }
}

