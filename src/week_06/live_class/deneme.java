package week_06.live_class;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
    public static boolean isPalindrome(int number) {
        String strOfNumber = Integer.toString(number);
        int firstIndexOfStrOfNumber = 0;
        int lastIndexOfStrOfNumber = strOfNumber.length() - 1;

        while (firstIndexOfStrOfNumber <= lastIndexOfStrOfNumber) {
            if (strOfNumber.charAt(firstIndexOfStrOfNumber) != strOfNumber.charAt(lastIndexOfStrOfNumber)) {
                return false;
            }
            firstIndexOfStrOfNumber++;
            lastIndexOfStrOfNumber--;
        }
        return true;
    }

}
