package week_01.live_class;

import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0 + (int) (Math.random() * (10 - 0));
        int number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        } //BU SWAP ALGORITMASI


        System.out.println(number1 + " - " + number2 + " =?");
        int answer = input.nextInt();
        System.out.println(number1 + " - " + number2 + " = " + answer + " is " + (number1 - number2 == answer));
    }
}
