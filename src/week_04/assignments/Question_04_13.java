package week_04.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String index = input.nextLine();
        char letter = index.charAt(0);

        switch (letter){

            case'A': System.out.println(letter + " is a vowel.");break;
            case'a': System.out.println(letter + " is a vowel.");break;
            case'E': System.out.println(letter + " is a vowel.");break;
            case'e': System.out.println(letter + " is a vowel.");break;
            case'I': System.out.println(letter + " is a vowel.");break;
            case'i': System.out.println(letter + " is a vowel.");break;
            case'O': System.out.println(letter + " is a vowel.");break;
            case'o': System.out.println(letter + " is a vowel.");break;
            case'U': System.out.println(letter + " is a vowel.");break;
            case'u': System.out.println(letter + " is a vowel.");break;
            default:  System.out.println(letter + " is a consonant.");

        }
    }
}
