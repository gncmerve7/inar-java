package week_08.assignments;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {

        if (isEqual()) {
            System.out.println("The two arrays are strictly identical.");
        } else
            System.out.println("The two arrays are not strickly identical.");
    }

    public static int[][] createMatrix(int r, int c) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the list");
        int[][] arr = new int[r][c];
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
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    equal = false;
                } else
                    equal = true;
            }
        }
        return equal;

    }
}
