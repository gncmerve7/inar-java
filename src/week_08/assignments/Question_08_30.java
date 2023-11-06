package week_08.assignments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {

    }

   // public static double[] lineerEquation(double[][] a, double[] b) {


   // }

    public static double[] createSingle() {
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();
        }
        return arr;

    }

    public static double[][] createMulti() {
        Scanner scan = new Scanner(System.in);
        double[][] arr = new double[8][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }
        return arr;

    }
}
