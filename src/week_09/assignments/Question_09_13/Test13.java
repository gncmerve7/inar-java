package week_09.assignments.Question_09_13;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        Location arr1 = new Location(row, col);
        System.out.println(arr1.getMax(arr1.getArray()));

    }
}