package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        ArrayList<Double> list = new ArrayList<>();
        double sum = 0;
        double element = 0;
        for (int i = 0; i < 5; i++) {
            element = scan.nextDouble();
            list.add(element);
            sum += element;
        }
        System.out.println(list);
        System.out.println("Sum of list: " + sum);

    }
}
