package week_04.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String ch = input.nextLine();
        char majorX = ch.charAt(0);
        char major = Character.toUpperCase(majorX);
        char grade = ch.charAt(1);
        switch (major) {
            case 'M':
                System.out.print("Mathematics");
                break;
            case 'C':
                System.out.print("Compter Science");
                break;
            case 'I':
                System.out.print("Information Technology");
                break;
        }
        switch (grade) {
            case '1':
                System.out.print(" Fresman");
                break;
            case '2':
                System.out.print(" Sophomore");
                break;
            case '3':
                System.out.print(" Junior");
                break;
            case '4':
                System.out.print(" Senior");
                break;

        }
    }
}