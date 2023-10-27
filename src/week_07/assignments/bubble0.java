package week_07.assignments;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class bubble0 {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 3, 2, 1,};


       System.out.println("$"+Arrays.toString(arr));
       bubbleSort(arr);
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
