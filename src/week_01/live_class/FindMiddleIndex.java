package week_01.live_class;

import java.util.Scanner;

public class FindMiddleIndex {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();
        int lengthOfWord = word.length();
        int middleIndexL = lengthOfWord / 2;

        System.out.println(word.substring(middleIndexL, middleIndexL + 1));
        System.out.println(word.substring(middleIndexL - 1, middleIndexL + 1));

        if (lengthOfWord % 2 == 0) {
            char middleIndex = word.charAt(middleIndexL - 1);
            char middleIndex1 = word.charAt(middleIndexL);
            System.out.println(middleIndex + " " + middleIndex1);
            System.out.println(word.substring(middleIndexL, middleIndex1));

        } else {
            char middleIndex = word.charAt(middleIndexL);
            System.out.println(middleIndex);
        }

    }
}
