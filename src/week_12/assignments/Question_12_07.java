package week_12.assignments;

import java.util.Scanner;

public class Question_12_07 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        try {
            String str = scan.next();

            bin2Dec(str);

        } catch (NumberFormatException e) {
            System.out.println("It is not a binary string.");
        }
    }

    public static void bin2Dec(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '1') {
                throw new NumberFormatException();
            } else
                num = Integer.parseInt(str, 2);
        }
        System.out.println("The decimal value for binary number is : " + num);

    }
}
