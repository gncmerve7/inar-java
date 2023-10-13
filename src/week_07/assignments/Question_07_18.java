package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            bubbleSort(arr);
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j ];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}
