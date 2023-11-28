package week_12.assignments;

import java.util.Random;
import java.util.Scanner;

public class Question_12_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(i + "->" + arr[i]);
        }

        System.out.println("Enter the index of the array: ");
        try {
            int num = scan.nextInt();
            System.out.println(arr[num]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds!!");
        }
    }
}
