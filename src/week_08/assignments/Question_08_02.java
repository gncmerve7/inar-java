package week_08.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] arr = new double[4][4];
        System.out.println("Enter a 4 by 4 matrix row by row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }
        sumOfMajor(arr);
    }

    public static double sumOfMajor(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        System.out.println("Sum of the elements in the major diagonal is " + sum);
        return sum;
    }
}
