package week_06.assignments;

public class Question_06_26 {
    public static void main(String[] args) {
        palindromicPrime(100);
    }

    public static void palindromicPrime(int numOfPalindroPrime) {
        int count = 0;
        for (int j = 2; j >= 2; j++) {
            if (isPrime(j) && isPalindrome(j)) {
                System.out.printf("%6d ", j);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
                while (count == numOfPalindroPrime)
                    return;
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number/2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true
                ;
    }

    public static boolean isPalindrome(int numm) {
        if (numm == reverse(numm))
            return true;
        else
            return false;
    }

    public static int reverse(int num) {
        String reverse = "";
        String st = "" + num;
        for (int i = st.length() - 1; i >= 0; i--) {
            reverse += st.charAt(i);
        }
        int result = Integer.valueOf(reverse);
        return result;
    }
}
