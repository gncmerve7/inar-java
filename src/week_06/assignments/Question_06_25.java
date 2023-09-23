package week_06.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        int milliseconds = input.nextInt();
        System.out.print("hours:minutes:seconds: " + convertMillis(milliseconds));
    }

    public static String convertMillis(long millis) {

        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        String result = currentHour + ":" + currentMinute + ":" + currentSecond;
        return result;
    }
}