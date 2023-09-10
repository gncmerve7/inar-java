package week_05.assignments;

public class Question_05_15 {
    public static void main(String[] args) {
        int count = 0;
        for (char i = 33; i <= 126; i++) {
            count++;
            if (count % 10 == 0) {
                System.out.println(" " + i);
            } else
                System.out.print(" " + i);
        }
    }
}