package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String st = input.nextLine();
        int length = st.length();
        for (int i = 0; i < length; i += 2) {
            char odd = st.charAt(i);
            System.out.print(odd);
        }

    }
}