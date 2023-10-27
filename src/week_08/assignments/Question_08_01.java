package week_08.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double arr[][] = createMatrix();
        sumColumn(arr, 0);
        sumColumn(arr, 1);
        sumColumn(arr, 2);
        sumColumn(arr, 3);

    }

    public static double sumColumn(double[][] m, int columIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columIndex];
        }
        System.out.println("Sum of the elements at column " + columIndex + " is " + sum);

        return sum;
    }

    public static double[][] createMatrix() {

        Scanner scan = new Scanner(System.in);
        double arr[][] = new double[3][4];
        System.out.println("Enter a 3 by 4 matrix row by row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}


