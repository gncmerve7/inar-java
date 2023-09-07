package week_02.assignments;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println(" Enter the radius and length of cylinder:  ");
        double length = x.nextDouble();
        double radius = x.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area is: " + area);
        double volume = radius * radius * PI * length;
        System.out.println("The volume is: " + volume);
    }
}
