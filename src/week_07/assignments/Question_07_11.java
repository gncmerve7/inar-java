package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        System.out.print("The mean is: " + mean(arr));

        System.out.println("\nThe standard deviation is: " + deviation(arr));
    }

    public static double mean(double arr[]) {
        double mean = 0;
        for (int i = 0; i < arr.length; i++) {
            mean += arr[i] / arr.length;

        }
        return mean;

    }

    public static double deviation(double arr[]) {
        double sum = 0;
        double devi = 0;
        double mean = mean(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow((arr[i] - mean), 2);
            devi = Math.pow((sum / (arr.length - 1)), 0.5);
        }
        return devi;
    }
}
