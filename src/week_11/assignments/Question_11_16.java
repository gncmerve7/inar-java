package week_11.assignments;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        System.out.println("What is " + num1 + " + " + num2 + "?");

        ArrayList<Integer> answers = new ArrayList<>();
        int userAnswer = scan.nextInt();
        int result = num1 + num2;
        answers.add(userAnswer);

        do {

            for (int i = 0; i < answers.size(); i++) {
                if (answers.get(i) != result) {
                    System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 + "?");
                    userAnswer = scan.nextInt();
                    if (answers.get(i) != result && answers.contains(userAnswer)) {
                        System.out.println("You already entered " + userAnswer);
                    }
                    answers.add(userAnswer);
                }
            }
        }
        while (userAnswer != result);

        System.out.println("You got it.");
    }
}