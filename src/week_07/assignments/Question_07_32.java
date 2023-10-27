package week_07.assignments;

import java.util.Arrays;

public class Question_07_32 {

    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 16, 61, 9, 11, 1};
        System.out.println("Pivot: " + arr[0]);
        System.out.println(Arrays.toString(arr));
        int pivotIndex = partition(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void shiftRightArr(int[] arr, int low) {
        int start = arr[low];
        for (int i = low; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = start;
    }

    public static int partition(int[] arr) {
        int pivot = arr[0];
        int pivotIndex = 0;
        int low = 1;
        int high = arr.length - 1;

        while (low <= high) {
            while (pivot >= arr[low]) {
                //shiftRightArr(arr, low);
                low++;
            }
            pivotIndex = low - 1;

            if (pivot > arr[high]) {

                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                high--;
            }
        }
        return pivotIndex;
    }
}