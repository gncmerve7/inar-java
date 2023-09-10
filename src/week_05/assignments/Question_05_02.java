package week_05.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int correct = 0;
        long timeOfStart = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {

            int num1 = (int) (Math.random() * (15) + 1);
            int num2 = (int) (Math.random() * (15) + 1);

            System.out.print("What is " + num1 + "+" + num2 + "? ");
            int answer = input.nextInt();
            if ((answer) == (num1 + num2)) {

                System.out.println(" You are correct!");
                correct++;
            } else
                System.out.println(num1 + "+" + num2 + " should be " + (num2 + num1));
        }
        long timeOfEnd = System.currentTimeMillis();
        System.out.println("Correct count is " + correct);
        System.out.println("Test time is " + ((timeOfEnd - timeOfStart) / 1000) + " seconds");
    }
}
