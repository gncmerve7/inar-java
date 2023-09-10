package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimial interger: ");
        int numDeci = input.nextInt();
        String numOct = "";

        for (int remaining = numDeci; remaining > 0; remaining /= 8) {
            numOct += (remaining % 8);
        }
        System.out.println("The octal value of " + numDeci + " is: " + numOct);
    }

}

