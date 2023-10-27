package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numOfStudent = input.nextInt();
        int[] numOfStud = new int[numOfStudent];
        String[] name = new String[numOfStudent];
        int[] score = new int[numOfStudent];
        System.out.print("Enter player's name and score: ");
        for (int i = 0; i < numOfStud.length; i++) {
            name[i] = input.next();
            score[i] = input.nextInt();

        }
        // sort(name, score);
    }

    public static void sort(String name[], int[] score) {
        for (int j = 0; j < score.length; j++) {
            int tempMin = score[j];
            for (int i = 0; i < score.length; i++) {
                if (score[i] < tempMin) {
                    tempMin = score[i];
                    score[i] = score[j];
                    // System.out.println("Player: " + j + " ,score: " + score[j]);
                }
            }

        }
    }
}

