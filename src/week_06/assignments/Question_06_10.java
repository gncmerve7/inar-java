package week_06.assignments;

public class Question_06_10 {
    public static void main(String[] args) {
        System.out.print("The number of prime numbers less than 10,000 is: ");
        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0)
                return false;
        }
        return true;
    }
}