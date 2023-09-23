package week_06.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double n1, double n2, double n3) {
        double tempMax = n1 > n2 ? n1 : n2;
        double max = n3 > tempMax ? n3 : tempMax;
        double tempMin = n1 < n2 ? n1 : n2;
        double min = n3 < tempMin ? n3 : tempMin;
        double tempMid = n2 < max && n2 > min ? n2 : n1;
        double mid = tempMid < max && tempMid > min ? tempMid : n3;
        System.out.print(min + " " + mid + " " + max);
    }
}

