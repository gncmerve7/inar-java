package week_09.assignments.Question_09_13;

import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public int maxValue;

    Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String getMax(int arr[][]) {

        this.maxValue = arr[0][0];
        int col = 0;
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    col = i;
                    row = j;
                }
            }
        }
        return "The location of the largest element " + maxValue + " is at (" + col + "," + row + ")";
    }

    public int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[this.row][this.column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
