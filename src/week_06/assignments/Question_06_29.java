package week_06.assignments;

public class Question_06_29 {
    public static void main(String[] args) {
        // int number = 3;
        for (int number = 3; number <= 1000; number++) {
            //  while (number <= 1000) {
            if (isPrime(number) && isPrime((number + 2))) {
                System.out.println("(" + number + ", " + (number + 2) + ")");
            }
            //   number++;
        }
    }

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0)
                return false;
        }
        return true;
    }
}

