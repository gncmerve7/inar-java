package week_06.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year" + "\t" + "Days in year");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(numberOfDaysInAYear(year));

        }
    }

    public static int numberOfDaysInAYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.print(year + "\t\t");
            return 366;
        } else
            System.out.print(year + "\t\t");
        return 365;
    }
}