package week_06.live_class;

import java.util.Scanner;

public class Mentor_Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the month");
        int month = input.nextInt();

        printCalender(year, month);
    }

    public static void printCalender(int year, int month) {
        printTitle(year, month);
        printBody(year, month);

    }

    public static void printTitle(int year, int month) {
        System.out.println("\t\t" + getNameOfMonth(month) + "\t" + year);
        System.out.println("-------------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getNameOfMonth(int month) {
        String nameOfMonth = "";
        switch (month) {
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
        }
        return nameOfMonth;
    }

    public static void printBody(int year, int month) {

        int startDay = getStartDay(year, month, 1);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            if ((i + startDay) % 7 == 0)
                System.out.println(i);
            else
                System.out.printf("%-4d", i);
        }
        System.out.println();
    }

    public static int getStartDay(int year, int m, int x) {

        if (m == 1 || m == 2) {
            m += 12;
            year--;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (x + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7;

    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return (isLeapYear(year)) ? 29 : 28;
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
