package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[] = new int[10];
        System.out.print("Enter 10 numbers:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Display numbers: ");
        display(arr1);
        System.out.println("\nDisplay numbers in reverse: ");
        reverse(arr1);
    }

    public static void reverse(int arr[]) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
