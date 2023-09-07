package week_01.live_class;

import java.util.Scanner;

public class MinMaxAgain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, mid, max;
        int num1 = 5;
        int num2 = 22;
        int num3 = 18;
        int tempMax = Math.max(num1, num2);
        max = Math.max(tempMax, num3);


        // System.out.println("The numbers are %d, %d, %d\n",num1,num2,num3);
        System.out.println("The max number is %d\n" + max);
    }
}
