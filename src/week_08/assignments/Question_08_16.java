package week_08.assignments;

import week_07.assignments.Question_07_31;

import java.util.Arrays;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] arr = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort();
    }

    public static void sort() {
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        int[] tempArr = new int[m.length];
        int[] tempArr2 = new int[m.length];
        int[][] newArr = new int[tempArr.length][tempArr2.length];

        for (int i = 0; i < m.length; i++) {
            tempArr[i] = m[i][0];
        }

        for (int i = 0; i < m.length; i++) {
            tempArr2[i] = m[i][1];
        }

        Arrays.sort(tempArr);
        Arrays.sort(tempArr2);


        for (int l = 0; l < tempArr.length; l++) {
            System.out.print(tempArr[l] + " ");
        }
        System.out.println();
        for (int r = 0; r < tempArr2.length; r++) {
            System.out.print(tempArr2[r] + " ");

        }
        display(Question_07_31.merge(tempArr, tempArr2));
    }

    public static void display(int arr[]) {
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}