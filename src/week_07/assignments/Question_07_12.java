package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers: ");

        reverse(arr);

    }

    public static void reverse(int[] arr1) {
        Scanner scan = new Scanner(System.in);
        int[] reverse = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println();

        for (int j = arr1.length - 1; j >= 0; j--) {
            reverse[j] = arr1[j];
            System.out.print(reverse[j] + " ");

        }
    }
}

