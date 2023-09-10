package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        String highestSut = "";
        System.out.print("Enter the number of students: ");
        int numOfSut = input.nextInt();
        System.out.println("Enter each student's name and score: ");

        for (int student = 1; student <= numOfSut; student++) {

            System.out.println("Student: " + student);
            System.out.print("Name: ");
            String nameOfSut = input.next();
            System.out.print("Score: ");
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestSut = nameOfSut;
            }
        }
        System.out.println("Student with the highest score: " + highestSut);
    }
}