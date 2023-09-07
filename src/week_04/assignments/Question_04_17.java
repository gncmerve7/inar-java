package week_04.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        System.out.print("Enter a month:");
        String month = input.next();

        String monthc = month.substring(0, 3);
        boolean leapYear = (year % 4 == 0 && year % 100 != 0);
        switch (monthc) {

            case ("Jan"):
                System.out.println("Jan " + year + " has 31 days.");
                break;
            case ("Feb"):
               // System.out.println((year=leapYear)?"29":"28");break;
                System.out.println("Feb " + year + " has 28 days.");
                break;
            case ("Mar"):
                System.out.println("Mar " + year + " has 31 days.");
                break;
            case ("Apr"):
                System.out.println("Jan " + year + " has 30 days.");
                break;
            case ("May"):
                System.out.println("Jan " + year + " has 31 days.");
                break;
            case ("Jun"):
                System.out.println("Jan " + year + " has 30 days.");
                break;
            case ("Jul"):
                System.out.println("Jan " + year + " has 31 days.");
                break;
            case ("Aug"):
                System.out.println("Jan " + year + " has 31 days.");
                break;
            case ("Sep"):
                System.out.println("Jan " + year + " has 30 days.");
                break;
            case ("Oct"):
                System.out.println("Jan " + year + " has 31 days.");
                break;
            case ("Nov"):
                System.out.println("Jan " + year + " has 30 days.");
                break;
            case ("Dec"):
                System.out.println("Jan " + year + " has 31 days.");
                break;


        }

    }
}
