package week_06.assignments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(getNumber(str.charAt(i)));
            } else System.out.print(str.charAt(i));
        }
    }

    public static int getNumber(char upperCaseLetter) {
        switch (Character.toUpperCase(upperCaseLetter)) {
            case 'A':
                return 2;
            case 'B':
                return 2;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 3;
            case 'F':
                return 3;
            case 'G':
                return 4;
            case 'H':
                return 4;
            case 'I':
                return 4;
            case 'J':
                return 5;
            case 'K':
                return 5;
            case 'L':
                return 5;
            case 'M':
                return 6;
            case 'N':
                return 6;
            case 'O':
                return 6;
            case 'P':
                return 7;
            case 'Q':
                return 7;
            case 'R':
                return 7;
            case 'S':
                return 7;
            case 'T':
                return 8;
            case 'U':
                return 8;
            case 'V':
                return 8;
            case 'W':
                return 9;
            case 'X':
                return 9;
            case 'Y':
                return 9;
            case 'Z':
                return 9;
            default:
        }
        return upperCaseLetter;
    }
}