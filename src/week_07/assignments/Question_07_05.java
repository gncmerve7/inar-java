package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();

        distinct(arr);
    }

    public static void distinct(int arr[]) {


        String result = "";
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            int temp = arr[j];//first 0
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == temp) {
                    count++;
                }
            }
            if (count == 1) {
                result += arr[j] + " ";
            } else if (count > 1 && !result.contains("" + arr[j]))
                result += arr[j] + " ";

        }
        System.out.println("The number of distinct number is: " + (result.length() / 2));
        System.out.print("The distinct numbers are: " + result);
    }
}