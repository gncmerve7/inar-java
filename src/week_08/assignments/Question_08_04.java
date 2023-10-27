package week_08.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        int numOfEmplo = scan.nextInt();
        int[][] arr = new int[numOfEmplo][7];
        System.out.println("Enter the working hours for each employee: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        totalHour(arr);
       // Arrays.sort(arr);
    }

    public static int[] totalHour(int[][] arr) {
        int[] total = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            total[i] = 0;

            for (int j = 0; j < arr[i].length; j++) {
                total[i] += arr[i][j];
            }
            System.out.println("Employee " + (i + 1) + "'s total work hour is " + total[i]);
        }
        return total;
    }
}
