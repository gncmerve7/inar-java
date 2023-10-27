package week_08.assignments;

import java.util.Arrays;

public class Question_08_03 {//asb

    public static void main(String[] args) {

        result(answers(), keyTo());
    }

    public static char[][] answers() {

        char[][] answer =
                {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        return answer;
    }

    public static char[] keyTo() {
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        return key;
    }

    public static void result(char answer[][], char[] key) {
        // int[][] sort = new int[answer.length][];
        int numOfCorrect = 0;
        for (int i = 0; i < answer.length; i++) {
            numOfCorrect = 0;
            for (int j = 0; j < answer[i].length; j++) {
                if (answer[i][j] == (key[j])) {
                    numOfCorrect++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " +
                    numOfCorrect);

        }
    }

    public static int[][] sort(int[][] arr) {

        Arrays.sort(arr);
        return arr;
    }
}


