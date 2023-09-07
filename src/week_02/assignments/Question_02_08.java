package week_02.assignments;

import java.util.Scanner;

public class Question_02_08 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = x.nextInt();
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}
