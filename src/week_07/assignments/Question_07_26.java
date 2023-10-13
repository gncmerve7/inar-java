package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {

        if (equals(getValues(), getValues())) {
            System.out.println("Two list are strictly identical");
        } else
            System.out.println("Two list are not strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {

        if (Arrays.equals(list1, list2)) {
            return true;
        } else
            return false;
    }

    public static int[] getValues() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the list:");
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
