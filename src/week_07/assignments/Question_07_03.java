package week_07.assignments;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count[] = new int[100];
        countS(count);
    }

    public static void countS(int arr[]) {
        Scanner input = new Scanner(System.in);

        int count[] = new int[100];
        int i = 0;
        arr[i]=0;
        System.out.println("Enter integers between 1 and 100: ");
        for (; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
            count[arr[i]]++;
        }
        for (int j = 0; j < count.length; j++) {
            if (count[arr[j]] > 0) {

                System.out.println("The number " + (arr[j]) + " occurs: " + count[arr[j]] + (count[arr[j]] > 1 ? "times" : "time"));

            }
        }
    }
}
