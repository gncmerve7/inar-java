package week_02.assignments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        double minutes = x.nextDouble();
        double years = minutes / 525600;
        double days = (minutes % 525600) / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
