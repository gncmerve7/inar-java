package week_06.assignments;


import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number + (isPalindrome(number) ? " is a polindrome." : " is not a polindrome."));
    }

    public static boolean isPalindrome(int n) {
        if (n == reverse(n)) {
            return true;
        } else
            return false;
    }

    public static int reverse(int n) {
        String reverse = "";
        String st = n + "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reverse += st.charAt(i);
        }
        int result = Integer.valueOf(reverse);
        return result;
    }
}


