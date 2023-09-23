package week_06.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.printf("%2s %22s\n", "p", "(2^p-1)");
        System.out.println("--------------------------");

        for (int j = 2; j <= 31; j++) {
            if (isPrime(j) && isPrime((int) (Math.pow(2, j) - 1))) {
                System.out.printf("%-20d %-18d\n", j, (int) (Math.pow(2, j) - 1));
            }
        }
    }

    public static boolean isPrime(int p) {
        for (int divisor = 2; divisor <= p / 2; divisor++) {
            if (p % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
