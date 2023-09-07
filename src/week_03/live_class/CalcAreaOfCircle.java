package week_03.live_class;

import java.util.Scanner;

public class CalcAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        double r = input.nextDouble();
        double area = PI * Math.pow(r, 2);
        System.out.println(area);
        System.out.println(Math.ceil(area));
        System.out.println(Math.floor(area));
        System.out.println(Math.round(area));

    }
}

