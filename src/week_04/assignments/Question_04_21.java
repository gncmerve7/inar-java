package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = input.nextLine();
        char hyphen = ssn.charAt(3);
        char hyphen2 = ssn.charAt(6);

        if (hyphen == '-' && hyphen2 == '-' && Character.isDigit(ssn.charAt(0))
                && Character.isDigit(ssn.charAt(1))
                && Character.isDigit(ssn.charAt(2)) && Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5))
                && Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9))
                && Character.isDigit(ssn.charAt(10))) {

            System.out.println(ssn + " is a valid social security number");

        } else
            System.out.println(ssn + " is an invalid social security number");
    }
}
