package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Enter the number of elements for list1");
        int num1 = scan.nextInt();
        System.out.println("Enter the list1: ");
        int[] list1 = new int[num1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.println("Enter the number of elements for list2");
        int num2 = scan.nextInt();
        System.out.println("Enter the list1: ");
        int[] list2 = new int[num2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scan.nextInt();
        }*/

        int[] list1 = {5, 2, 9, 3, 6, 8};
          int[] list2 = {10, 1, 5, 16, 61, 9, 11, 1};
   sort(list1);
     sort(list2);
    }

    /*public static void sort(int arr[], int length) {
        int pivot = arr[0];
        for (int i = 1; i < length; i++) {

            int temp = arr[i];
            while (temp < arr[i - 1]) {
                arr[i] = arr[i - 1];
                if (--i <= 0) break;/////////////////////////
            }

            arr[i] = temp;
            System.out.println(Arrays.toString(arr));

        }
        // System.out.println(Arrays.toString(arr));*/

    public static void sort(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            int pivot=arr[0];
            for (int i = j + 1; i < arr.length; i++) {
                int temp = arr[j];
                if (arr[j] > arr[i]) {
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            if(arr[j]>pivot){
                arr[j]=arr[j+1];
                pivot=arr[j];
            }
            System.out.print(arr[j] + " ");
        }
    }

}
