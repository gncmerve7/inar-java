package week_02.live_class;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();
        boolean LeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if(LeapYear) {
            System.out.println(year + " is a leap year. " );
        } else{
            System.out.println((year+"is not leap year. "));
        }
        System.out.println(year + " is a leap year. " + LeapYear);

    }
}
