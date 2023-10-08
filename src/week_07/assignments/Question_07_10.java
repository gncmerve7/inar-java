package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.print("Enter 10 numbers: ");
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextDouble();

        }
        smallest(arr,index);
    }

    public static void smallest(double arr[],int index) {
        double min = arr[0];
         index = 0;
        for (int i = 0; i < arr.length; i++) {//9751875
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }

        }
        System.out.println("The minimum number is " + min + " The index of min number is " + index);// ???

    }
}