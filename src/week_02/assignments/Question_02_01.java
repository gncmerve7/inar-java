package week_02.assignments;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a degree in Celcius: ");
        int celcius = x.nextInt();
        double fahrenheit = (9.0 / 5.0) * celcius + 32;
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
    }
}
