package week_08.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_29 {
    public static void main(String[] args) {

        if (isEqual()) {
        System.out.println("The two arrays are identical.");
         } else
            System.out.println("The two arrays are not identical.");
    }

    public static int[][] createMatrix(int num1, int num2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the list");
        int[][] arr = new int[num1][num2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static boolean isEqual() {
        boolean equal = true;
        int[][] arr1 = createMatrix(3, 3);
        int[][] arr2 = createMatrix(3, 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {

        }}

        return equal;

    }

    public static int[] sort(int[]arr) {
        Arrays.sort(arr);
            return arr;
    }

    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}