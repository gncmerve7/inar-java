package week_07.assignments;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        System.out.print("The minimum number is: " + min(arr));
    }

    public static double min(double arr[]) {

        double tempMin = 0;
        for (int i = 0; i < arr.length; i++) {
            tempMin = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    tempMin = arr[j];
            }
        }
        return tempMin;

    }
}
