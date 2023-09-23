package week_06.assignments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Display and integer reversed:");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);
    }

    public static int reverse(int n) {
        String s = "" + n;
        int i = 0;
        char reverse = s.charAt(i);
        for (i = s.length() - 1; i >= 0; i--) {
            reverse = s.charAt(i);
            System.out.print(reverse);
        }
        return reverse;
    }
}






