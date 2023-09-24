package week_06.assignments;

public class Question_06_27 {
    public static void main(String[] args) {

        int number = 2;
        int count = 0;
        for (number = 2; number >= 2; number++) {
            if (Question_06_26.isPrime(number) && Question_06_26.isPrime(Question_06_03.reverse(number))
                    && !Question_06_03.isPalindrome(number)) {
                System.out.printf("%4d ", number);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
                if (count == 100) {
                    break;
                }
            }
        }
    }
}