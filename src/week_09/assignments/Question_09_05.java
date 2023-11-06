package week_09.assignments;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {

        GregorianCalendar time = new GregorianCalendar();

        displayDate(time);

        time.setTimeInMillis(1234567898765L);

        System.out.println("After set time");
        displayDate(time);
    }

    public static void displayDate(GregorianCalendar time) {
        int year = time.get(GregorianCalendar.YEAR);
        int month = time.get(GregorianCalendar.MONTH) + 1;
        int day = time.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current year :" + year);
        System.out.println("Current month :" + month);
        System.out.println("Current day :" + day);
    }
}
