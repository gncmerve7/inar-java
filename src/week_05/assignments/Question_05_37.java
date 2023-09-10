package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimial interger: ");
        int numDeci = input.nextInt();
        String numBin = "";

        for (int remaining = numDeci; remaining > 0; remaining /= 2) {
            numBin += (remaining % 2);
        }
        System.out.println("The binary value of the decimial " + numDeci + " is: " + numBin);
    }
}
