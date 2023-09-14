package week_05.assignments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = input.nextLine();
        int length = st.length();
        for (int i = length - 1; i >= 0; i--) {
            char chr = st.charAt(i);

            System.out.print(chr);
        }
    }
}

