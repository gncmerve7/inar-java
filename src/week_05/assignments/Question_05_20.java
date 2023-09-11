package week_05.assignments;

public class Question_05_20 {
    public static void main(String[] args) {
        int line = 0;
        prime:
        for (int num = 2; num <= 1000; num++) {
            for (int divisor = 2; divisor < num; divisor++) {
                if ((num % divisor) == 0) {
                    continue prime;
                }
            }
            line++;
            if (line % 8 != 0)
                System.out.print( num + " ");
            else
                System.out.println(num );

        }
    }
}
