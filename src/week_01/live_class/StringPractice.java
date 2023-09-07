package week_01.live_class;

import java.util.Scanner;

public class StringPractice {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a string: ");
        String name = input.nextLine();

        name = name.trim();
        int length = name.length();
        char firstCharacter = name.charAt(length - 1);
        char firstCharacterw = name.charAt(name.length() - 1);

        System.out.println("The first character of your name is " + firstCharacter + firstCharacterw + " and length of name is " + length);
    }
}
