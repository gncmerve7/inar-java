package week_05.assignments;

import java.util.Scanner;

public class Question_05_27 {
    public static void main(String[] args) {

        int countLeap = 0;

        for (int year = 101; year <= 2100; year++) {
            if (year % 4 == 0 && year % 100 != 0) {
                countLeap++;
                System.out.print(" ");
                if (countLeap % 10 == 0) System.out.println(year + " ");

                else if (countLeap % 10 != 0) {

                    System.out.print(year + " ");
                }
            }
        }
    }
}
