package week_04.assignments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city ");
        String city2 = input.nextLine();
        System.out.println("Enter the third city ");
        String city3 = input.nextLine();

        String cit1 = city1.toUpperCase();
        String cit2 = city2.toUpperCase();
        String cit3 = city3.toUpperCase();

        if (cit1.compareTo(cit2) < 0 && cit2.compareTo(cit3) < 0) {
            System.out.println("The three cities in alphabetical order are " + city1 + city2 + city3);
        } else if (cit1.compareTo(cit2) < 0 && (cit3.compareTo(cit2) < 0) && (cit1.compareTo(cit3) < 0)) {
            System.out.println("The three cities in alphabetical order are " + city1 + city3 + city2);
        } else if ((cit2.compareTo(cit1) < 0) && (cit1.compareTo(cit3) < 0)) {
            System.out.println("The three cities in alphabetical order are " + city2 + city1 + city3);
        } else if ((cit2.compareTo(cit1) < 0) && (cit3.compareTo(cit1) < 0) && (cit2.compareTo(cit3) < 0)) {
            System.out.println("The three cities in alphabetical order are " + city2 + city3 + city1);
        } else if ((cit3.compareTo(cit1) < 0) && (cit2.compareTo(cit1) < 0) && (cit3.compareTo(cit2) < 0)) {
            System.out.println("The three cities in alphabetical order are " + city3 + city2 + city1);

        }
    }
}
