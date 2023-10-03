package week_06.assignments;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n) {

        int num= (int) (Math.random()*2);

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.println(num + " ");

            }
            System.out.println();
        }
    }
}