package week_07.assignments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        System.out.println("Enter ten integers: ");
        Scanner scan = new Scanner(System.in);
        int arr1[] = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter ten double numbers: ");
        double arr2[] = new double[10];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = scan.nextDouble();
        }
        System.out.println("The avarage of 10 integers: " + avarage(arr1));
        System.out.println("The avarage of 10 double numbers: " + avarage(arr2));

    }

    public static double avarage(double arr[]) {
        double sum = 0;
        double avar = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            avar = sum / arr.length;
        }
        return avar;
    }

    public static int avarage(int arr[]) {
        int avar2 = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avar2 = sum / arr.length;

        }
        return avar2;
    }
}