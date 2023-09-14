package week_05.assignments;

public class Question_05_43 {
    public static void main(String[] args) {
        int count = 0;
        for (int num1 = 1; num1 <= 7; num1++) {
            for (int num2 = 7; num2 >= 1; num2--) {
                if (num1 == num2 || num2 > num1)
                    continue;
                System.out.println(" " + num1 + " " + num2);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}