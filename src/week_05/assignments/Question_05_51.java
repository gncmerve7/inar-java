package week_05.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String st1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String st2 = input.nextLine();

        int i = 0;
        int j = 0;
        char s1 = st1.charAt(i);
        char s2 = st2.charAt(j);
        if (s1 != s2) {
            System.out.println(st1 + " and " + st2 + " have no common prefix");
        }
        System.out.print("The common prefix is ");
        do {
            s1 = st1.charAt(i);
            s2 = st2.charAt(j);
            System.out.print(s1);
            i++;
            j++;
        } while (s1 == s2 && i < st1.length() && j < st2.length());

    }
}