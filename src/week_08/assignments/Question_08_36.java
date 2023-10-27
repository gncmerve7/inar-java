package week_08.assignments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        char letter = ' ';
        char[][] arr = new char[num1][num2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                letter = scan.next().charAt(0);
                arr[i][j] = letter;
            }
        }
        boolean isLatin = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                letter = arr[i][j];
                System.out.print(arr[i][j] + " ");
                if (65 <= (int) letter && (int) letter < (65 + num1)) {
                    isLatin = true;
                } else {
                    isLatin = false;
                    System.out.println("\nWrong input: the letters must be from " + (char) (65) + " to " + (char) (65 + num1 - 1));
                    return;
                }
            }
            System.out.println();
        }
        if (isLatin) {
            System.out.println("The input array is a Latin square.");

        }
    }

}