package week_12.assignments.question_12_08;

import java.util.Scanner;

public class Test_12_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hex number: ");

       /* try {
            String hexNum = scan.nextLine().toUpperCase();
            hex2Dec(hexNum);
            System.out.println("The decimal value of hex number " + hexNum + " is " + hex2Dec(hexNum));

       } catch (HexFormatException e) {
            System.out.println(e.toString());
    */   // }
    }

    public static int hex2Dec(String st) throws HexFormatException {
        for (int i = 0; i < st.length(); i++) {
            if (!((st.charAt(i) >= '0' && st.charAt(i) <= 'F'))) {
                throw new HexFormatException("It is not a hex string.");
            }
        }
        return convert(st);
    }

    public static int convert(String str) {
        int newNum = Integer.parseInt(str, 16);
        return newNum;
    }
}

