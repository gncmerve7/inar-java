package week_01.live_class;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        System.out.println("The number you entered " + x + " is " + (((x % 2) == 0) ? " even." : " odd."));

    }

}
