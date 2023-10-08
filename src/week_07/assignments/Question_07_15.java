package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        eliminateDuplicates(arr);
    }

    public static void eliminateDuplicates(int arr[]) {
        String result = "";
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            int temp = arr[j];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == temp) {
                    count++;
                }
            }

            if (count == 1) {
                result += arr[j] + " ";
            } else if (count > 1 && !result.contains("" + arr[j])) {
                result += arr[j] + " ";
            }
        }
        System.out.println("The distinct numbers are: " + result);
    }
}
