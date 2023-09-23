package week_06.assignments;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

public class Question_06_24 {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        Date currentDate = new Date();

        getDate(currentDate);
        convertTime(totalMilliseconds);
    }

    public static void convertTime(long millis) {

        long totalMilliseconds;
        totalMilliseconds = millis;

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        if (currentHour > 12) {
            currentHour -= 12;
            System.out.print(" " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
        } else
            System.out.print(" " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");

    }

    public static Date getDate(Date currentDate) {
        currentDate = new Date();
        SimpleDateFormat datedForm = new SimpleDateFormat("MM/dd/YYYY");
        System.out.print(datedForm.format(currentDate));
        return currentDate;
    }

}