package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student:");
        int length = input.nextInt();
        int[] scores = new int[length];
        String[] names = new String[length];
        System.out.println("Enter the name and score for each student: ");
        for (int i = 0; i < scores.length; i++) {
            names[i] = input.next();
            scores[i] = input.nextInt();
           // sort(names,scores);
        }
    }

    /*public static void sort(String[] name, int[] score) {

        for (int i = 0; i < score.length; i++) {
            for(int j=0;j<score.length;j++)
            if (score[i] < score[j]){
                System.out.println("Student"+(i+1)+": "+"\nScore: "+score[i]);
            }

}
        }
*/
    }
