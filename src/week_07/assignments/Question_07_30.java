package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {

        if (isConsecFour(getValues())) {
            System.out.println("The list has consecutive fours.");
        } else
            System.out.println("The list has not consecutive fours.");
    }


    public static boolean isConsecFour(int[] values) {
        String result = "";
        int count;
        for (int j = 0; j < values.length; j++) {
            count = 0;
            int temp = values[j];
            for (int i = 0; i < values.length; i++) {
                if (values[i] == temp)
                    count++;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }


    public static int[] getValues() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int numOf = input.nextInt();
        System.out.println("Enter the values:");
        int[] arr = new int[numOf];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        return arr;
    }
}