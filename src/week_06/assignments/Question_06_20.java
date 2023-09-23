package week_06.assignments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("The number of letters in the string \"" + str + "\" : " + countLetters(str));
    }

    public static int countLetters(String s) {

        int numOfLetters = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLetter(ch))
                numOfLetters++;
        }
        return numOfLetters;
    }

}
