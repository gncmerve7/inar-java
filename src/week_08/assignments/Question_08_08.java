package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {

        formula(createValue());
    }

    public static double formula(double[][] arr) {
        //Math.pow(Math.pow((arr[1][0] - arr[0][0]), 2) + Math.pow((arr[1][1] - arr[0][1]), 2);
        double minDistance = Math.pow(Math.pow((arr[1][0] - arr[0][0]), 2) + Math.pow((arr[1][1] - arr[0][1]), 2), 0.5);
        double distance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                distance = Math.pow(Math.pow((arr[j][0] - arr[i][0]), 2) + Math.pow((arr[j][1] - arr[i][1]), 2), 0.5);
                if (distance < minDistance) {
                    minDistance = distance;
                }
                System.out.println("The closest two points are (" + arr[i][0] + "," + arr[i][1] + "," + ") and (" + arr[j][0] + "," + arr[j][1] + "," + ")");

                System.out.println(" The distance is: " + distance);
                System.out.println(" The closest is: " + minDistance);
            }
        }
        return minDistance;
    }

    public static double[][] createValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int num = input.nextInt();
        double[][] arr = new double[num][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        return arr;
    }
}




