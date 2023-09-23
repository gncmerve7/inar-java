package week_05.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();

        for (int line = 1; line <= numOfLines; line++) {

            for (int i = 1; i <= numOfLines - line; i++) {
                System.out.print("  ");
            }
            for (int i = line; i > 1; i--) {
                System.out.print(i + " ");
            }
            for (int j = 1; j <= line; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}