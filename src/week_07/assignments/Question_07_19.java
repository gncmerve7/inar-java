package week_07.assignments;


import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element in the list:");
        int numOfelm = input.nextInt();
        int[] list = new int[numOfelm];
        System.out.println("Enter list:");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }


        if (isSorted(list)) {
            System.out.println("The list already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}