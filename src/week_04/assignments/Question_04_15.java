package week_04.assignments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letterS = input.nextLine();
        char letter = letterS.charAt(0);
        System.out.print("The corresponding number is ");
        switch (Character.toUpperCase(letter)) {
            case 'A': System.out.print("2");break;
            case 'B': System.out.print("2");break;
            case 'C': System.out.println("2");break;
            case 'D': System.out.println("2");break;
            case 'E': System.out.println("3");break;
            case 'F': System.out.println("3");break;
            case 'G': System.out.println("3");break;
            case 'H': System.out.println("4");break;
            case 'I': System.out.println("4");break;
            case 'J': System.out.println("4");break;
            case 'K': System.out.println("5");break;
            case 'L': System.out.println("5");break;
            case 'M': System.out.println("5");break;
            case 'N': System.out.println("6");break;
            case 'O': System.out.println("6");break;
            case 'P': System.out.println("7");break;
            case 'Q': System.out.println("7");break;
            case 'R': System.out.println("7");break;
            case 'S': System.out.println("7");break;
            case 'T': System.out.println("8");break;
            case 'U': System.out.println("8");break;
            case 'V': System.out.println("8");break;
            case 'W': System.out.println("9");break;
            case 'X': System.out.println("9");break;
            case 'Y': System.out.println("9");break;
            case 'Z': System.out.println("9");break;
        }
    }
}