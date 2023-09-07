package week_01.live_class;

import java.util.Scanner;

public class FindMaxNum {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();
        int tempmax = num1;
        if (num2 > tempmax) {
            tempmax = num2;
        }
        if (num3 > tempmax) {
            tempmax = num3;
        }
        System.out.println("The max number is: " + tempmax);

    }

}

