package week_07.assignments;


import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int scores[] = new int[5];
        System.out.println("Enter scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
            if (scores[i] < 0)
                break;
        }
        countOf(scores);
    }

    public static int avarage(int arr[]) {
        int sum = 0;
        int avar = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        avar = sum / arr.length;

        return avar;

    }

    public static void countOf(int arr[]) {
        int avar = avarage(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= avar) {
                count++;
            }
        }
        System.out.println("Avarage of scores: " + avar);
        System.out.println("Number of scores above or equal to avarage: " + count);
        System.out.println("Number of scores below avarage: " + (arr.length - count));

    }
}