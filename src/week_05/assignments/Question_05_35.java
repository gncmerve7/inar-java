package week_05.assignments;

public class Question_05_35 {
    public static void main(String[] args) {

        double total = 0;
        for (double i = 1; i <= 624; i++) {
            total += ((1) / (Math.pow(i, 0.5) + Math.pow((i + 1), 0.5)));
        }
        System.out.println(total);
    }
}