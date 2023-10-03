package week_06.assignments;

import java.util.Scanner;

public class Question_06_06 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter n: ");
                printMatrix(input.nextInt());
            }

            public static void printMatrix(int n) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print((int) (Math.random() * 2) + " ");
                    }
                    System.out.println();
                }
            }
        }