package week_08.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfCorrect = 0;
        String[][] guess = answers();
        for (int i = 0; i < guess.length; i++) {
            System.out.println("What is the capital of " + guess[i][0] + " ?");
            String answer = scan.nextLine().toLowerCase();
            if (answer.equals(guess[i][1])) {
                System.out.println("Your answer is correct!");
                numOfCorrect++;
            } else {
                System.out.println("The correct answer should be " + guess[i][1]);
            }
        }
        System.out.println("The correct count is: " + numOfCorrect);
    }

    public static String[][] answers() {
        String[][] result = {{"Alabama", "montgomery"},
                {"Alaska", "juneau"},
                {"Arizona", "phoenix"},
                {"Connecticut", "hartford"},
                {"Georgia", "atlanta"},
                {"New Hampshire", "concord"},
                {"New Jersey", "trenton"},
                {"New York", "albany"},
                {"Pennsylvania", "harrisburg"},
                {"Virginia", "richmond"}};
        return result;
    }
}


