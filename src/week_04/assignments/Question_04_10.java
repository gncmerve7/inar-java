package week_04.assignments;

import java.util.Scanner;

public class Question_04_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";
        String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
        String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
        String set4 = "8  9  10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";

        System.out.println("Is your birthday in set1?");
        System.out.println(set1);
        System.out.println("Enter N for No and Y for Yes:");
        String answer=input.nextLine();

        System.out.println("Is your birthday in set2?");
        System.out.println(set2);
        System.out.println("Enter N for No and Y for Yes:");
        String answer1=input.nextLine();

        System.out.println("Is your birthday in set 3?");
        System.out.println(set3);
        System.out.println("Enter N for No and Y for Yes:");
        String answer2=input.nextLine();

        System.out.println("Is your birthday in set4?");
        System.out.println(set4);
        System.out.println("Enter N for No and Y for Yes:");
        String answer3=input.nextLine();
    }
}
