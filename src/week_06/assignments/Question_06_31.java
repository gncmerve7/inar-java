package week_06.assignments;

import java.awt.datatransfer.ClipboardOwner;
import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long cardNum = input.nextLong();
        if (isValidCard(cardNum)) {
            System.out.println("Valid");
        } else
            System.out.println("Invalid");

    }

    public static boolean isValidCard(long num) {
        if (isLengthValid(num) && (isValidStart(num)) && (((sumOf2EvenPlaces(num) + sumOfOddPlaces(num)) % 10 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLengthValid(long num) {
        boolean valid = true;
        if (!(String.valueOf(num).length() >= 13 && String.valueOf(num).length() <= 16)) {
            return false;
        } else return valid;
    }

    public static boolean isValidStart(long num) {
        String numS = String.valueOf(num);
        if (!(numS.charAt(0) == '4' || numS.charAt(0) == '5' || numS.charAt(0) == '6' || (numS.charAt(0) == '3' && numS.charAt(1) == '7'))) {
            return false;
        } else
            return true;
    }

    public static int sumOf2EvenPlaces(long num) {
        String numS = String.valueOf(num);
        int sum = 0;
        for (int i = numS.length() - 2; i > 0; i -= 2) {
            sum += ((numS.charAt(i)) * 2);
            if ((numS.charAt(i) * 2) >= 10) {
                sum = (int) (numS.charAt(i) * 2) % 10;
                sum += (int) (numS.charAt(i) * 2) / 10;
            }
            return sum;
        }
        return sum;
    }

    public static int sumOfOddPlaces(long num) {
        String numS = String.valueOf(num);
        int sum = 0;
        for (int i = numS.length() - 1; i >= 1; i -= 2) {

            sum += numS.charAt(i);
        }
        return sum;
    }
}