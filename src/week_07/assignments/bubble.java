package week_07.assignments;

import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      //  for (int i = 0; i < arr.length; i++) {
       //     bubbleSort(arr);
       //     System.out.print(arr[i] + " ");
       // }
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    System.out.println(temp);

                }
                System.out.println("*"+arr[i] + " "+arr[j]+"*");

            }
            System.out.println("*"+arr[i] + " "+"&");

        }
    }
}
