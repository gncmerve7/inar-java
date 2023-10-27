package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        double[][] arr1 = createMatrix();
        double[][] arr2 = createMatrix();
        addMatrix(arr1, arr2);
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] arrSum = new double[a.length][a.length];

        for (int i = 0; i < arrSum.length; i++) {

            for (int j = 0; j < arrSum.length; j++) {
                arrSum[i][j] = a[i][j] + b[i][j];
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }
        return arrSum;
    }

    public static double[][] createMatrix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        double[][] arr = new double[size1][size2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }
        return arr;
    }
}