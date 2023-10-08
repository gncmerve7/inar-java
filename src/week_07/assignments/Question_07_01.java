package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numOfStudent = input.nextInt();
        System.out.println("Enter " + numOfStudent + " scores");

        int[] scores = new int[numOfStudent];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        grade(scores);
    }

    public static int grade(int[] score) {
        int best = bestScore(score);
        for (int i = 0; i < score.length; i++) {
            String gradeS = (score[i] >= (best - 10)) ? "A" : (score[i] >= (best - 20)) ? "B" : (score[i] >= (best - 30)) ? "C"
                    : (score[i] >= (best - 40)) ? "D" : "F";

            switch (gradeS) {

                case "A":
                    System.out.println("Student " + i + "'s score is " + score[i] + " and grade is A");
                    break;
                case "B":
                    System.out.println("Student " + i + "'s score is " + score[i] + " and grade is B");
                    break;
                case "C":
                    System.out.println("Student " + i + "'s score is " + score[i] + " and grade is C");
                    break;
                case "D":
                    System.out.println("Student " + i + "'s score is " + score[i] + " and grade is D");
                    break;
                case "F":
                    System.out.println("Student " + i + "'s score is " + score[i] + " and grade is F");
                    break;
            }
        }
        return best;
    }

    public static int bestScore(int[] score) {
        int bestS = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > bestS) {
                bestS = score[i];
            }
        }
        return bestS;
    }
}
