package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scan.nextInt();
        zodiac(year);
    }

    public static String[] zodiac(int year) {
        String[] years = new String[12];
        int remainOfYear;
        String name = "";

        for (int i = 0; i < years.length; i++) {
            remainOfYear = year % 12;

            switch (remainOfYear) {
                case 0:
                    name = "Monkey";
                    break;
                case 1:
                    name = "Rooter";
                    break;
                case 2:
                    name = "Dog";
                    break;
                case 3:
                    name = "Pig";
                    break;
                case 4:
                    name = "Rat";
                    break;
                case 5:
                    name = "Ox";
                    break;
                case 6:
                    name = "Tiger";
                    break;
                case 7:
                    name = "Rabbir";
                    break;
                case 8:
                    name = "Dragon";
                    break;
                case 9:
                    name = "Snake";
                    break;
                case 10:
                    name = "Horse";
                    break;
                case 11:
                    name = "Sheep";
                    break;
            }

        }
        System.out.println(year + " is a year of " + name + " in Zodiac.");

        return years;

    }
}
