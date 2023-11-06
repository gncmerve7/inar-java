package week_09.assignments;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random randNum = new Random(1000);

        for (int i = 0; i < 50; i++) {

            if (i % 10 == 0 && i != 0)
                System.out.println();

            System.out.printf(" %-2s", randNum.nextInt(100));
        }
    }
}
