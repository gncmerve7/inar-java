package week_05.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = input.nextLine();
        int length = st.length();
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i <= length - 1; i++) {
            int ch = st.charAt(i);
            if (65 <= ch && ch <= 90) {
                upperCase++;

            } else {
                lowerCase++;
            }
        }
        System.out.println("The number of uppercase letters is " + upperCase);

    }
}