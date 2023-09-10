package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        int highestSecond = 0;
        String highestSut = "";
        String sutSecond = "";
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
            } else if (score > highestSecond) {
                highestSecond = score;
                sutSecond = nameOfSut;
            }

        }
        System.out.println("The highest scoring student: " + highestSut);
        System.out.println("The second highest scoring student: " + sutSecond);
    }
}
