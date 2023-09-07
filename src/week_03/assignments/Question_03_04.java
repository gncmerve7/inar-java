package week_03.assignments;

import java.util.Scanner;

public class Question_03_04 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        System.out.println("What is " + number1 + "+" + number2 + "+" + number3 + "= ? ");
        int answer = x.nextInt();
        if (answer == (number1 + number2 + number3)) {
            System.out.println(number1 + "+" + number2 + "+" + number3 + "= " + answer + " is true");
        } else {
            System.out.println(number1 + "+" + number2 + "+" + number3 + "= " + answer + " is false");
        }
    }
}
