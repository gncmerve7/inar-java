package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimial interger: ");
        char newNum = ' ';
        int numDeci = input.nextInt();
        String numBin = "";

        for (int remaining = numDeci; remaining > 0; remaining /= 2) {
            numBin += (remaining % 2);
        }
        System.out.print("The binary value of the decimial " + numDeci + " is: ");
        for (int k = (numBin.length() - 1); k >= 0; k--) {
            newNum = numBin.charAt(k);

            System.out.print(newNum);
        }
    }

}