package week_06.assignments;


import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and it's width: ");
        int number = input.nextInt();
        System.out.print("");
        int width = input.nextInt();
        System.out.print(number + " formatted to width " + width+": "+format(number,width)+number);
    }

    public static String format(int num, int width) {
        String numS = String.valueOf(num);
        String widthS = String.valueOf(width);
        String formatted = "";
        if (numS.length() > width) {
            return formatted;
        } else {
            for (int i = 0; i < width - numS.length(); i++)
                formatted += "0";

            return formatted;
        }
    }
}
