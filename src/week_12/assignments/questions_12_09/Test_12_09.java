package week_12.assignments.questions_12_09;

import java.util.Scanner;

public class Test_12_09 {

    public static void main(String[] args) throws BinaryFormatException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number: ");

        try {
            String str = scan.nextLine();
            bin2Dec(str);
            System.out.println("The decimal value for binary number is : " + bin2Dec(str));

        } catch (BinaryFormatException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static int bin2Dec(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '1') {
                throw new BinaryFormatException("It is not a binary string.");
            }
        }
        return Integer.parseInt(str, 2);
    }
}

