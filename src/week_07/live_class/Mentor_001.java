package week_07.live_class;

import java.util.Scanner;

public class Mentor_001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }

        reverse(arr);
    }

    public static void reverse(int [] arr) {
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i] +" ");
        }

    }

}
