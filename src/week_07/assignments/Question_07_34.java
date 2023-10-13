package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to sort: ");
        String str = scan.nextLine();

        sortedString(str);
    }

    public static String[] sortedString(String s) {
        int lengthOfstr = s.length();
        String[] str = new String[lengthOfstr];

        for (int i = 0; i < str.length; i++) {
            char c = s.charAt(i);
            System.out.print(c);

        }
    //    Arrays.sort(str);
        return str;
    }
}
