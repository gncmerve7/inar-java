package week_09.assignments.Question_09_13;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }
}
