package week_07.assignments;


import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {

        sort(merge(getValues(), getValues()));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        int initIndex = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            merge[initIndex] = arr2[j];
            initIndex++;
        }
        return merge;
    }

    public static void sort(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                int temp = arr[j];
                if (arr[j] > arr[i]) {
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[j] + " ");
        }
    }

    public static int[] getValues() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num of element in array:");
        int numOfelem = input.nextInt();
        int[] list = new int[numOfelem];
        System.out.println("Enter the array:");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}


