package week_08.live_class;

import java.util.Scanner;

public class SortMatrix_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n = in.nextInt();
        System.out.println("Enter numbers in the matrix");
        int ar[][] = new int[n][n];
        int i, j, k, l;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                ar[i][j] = in.nextInt();
            }
        }
        System.out.println("\fOriginal matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        //sorting the matrix
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    for (l = 0; l < n; l++) {
                        if (ar[i][j] < ar[k][l]) { 
                            int temp = ar[i][j];
                            ar[i][j] = ar[k][l];
                            ar[k][l] = temp;
                        }
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("Sorted matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}

