package week_06.assignments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The approximated square root of " + number + " is: " + approximatedRoot(number));
    }

    public static double approximatedRoot(long num) {

        long nextGuess;
        long lastGuess = 1;
        nextGuess = (lastGuess + num / lastGuess) / 2;


        while (nextGuess - lastGuess > 0.0001) {
            lastGuess += 0.001;
            nextGuess = (lastGuess + num / lastGuess) / 2;
        }
        return nextGuess;
    }
}