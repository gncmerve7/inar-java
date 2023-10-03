package week_06.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValid(String pss) {
        if (letterOrDigit(pss) && (pss.length() >= 8) && isContains2Digit(pss)) {
            return true;
        } else
            return false;
    }

    public static boolean letterOrDigit(String ps) {
        for (int i = 0; i < ps.length(); i++)
            if (Character.isLetterOrDigit(ps.charAt(i))) {
                return true;
            } else {
            }
        return false;
    }

    public static boolean isContains2Digit(String pssw) {
        int numOfDigit = 0;
        for (int i = 0; i < pssw.length(); i++) {
            if (Character.isDigit(pssw.charAt(i))) {
                numOfDigit++;
            }
        }
        if (numOfDigit >= 2) {
            return true;
        } else
            return false;
    }
}
