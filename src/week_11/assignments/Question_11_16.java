package week_11.assignments;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userAnswer;
        int correctAnswer;

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        System.out.println("What is " + num1 + " + " + num2 + "?");
        do {
            ArrayList<Integer> result = new ArrayList<>();
            userAnswer = scan.nextInt();
            correctAnswer = num1 + num2;
            result.add(userAnswer);
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i) != correctAnswer) {
                    System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 + "?");
                    int userAnswer2 = scan.nextInt();
                    System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 + "?");
                    if (userAnswer2 != correctAnswer && result.contains(userAnswer2)) {
                        System.out.println("You already entered " + userAnswer);
                        System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 + "?");
                    }
                }
            }
        } while (num1 + num2 != userAnswer);
        System.out.println("You got it.");
    }
}
