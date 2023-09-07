package week_04.assignments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int code = input.nextInt();

        System.out.println("The character for ASCII code " + code + " is " + (char) code);
    }
}
