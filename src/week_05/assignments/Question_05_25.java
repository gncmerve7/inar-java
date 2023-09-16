package week_05.assignments;

public class Question_05_25 {
    public static void main(String[] args) {
        int i = 1;
        double pi=0;
        do {


            pi += 4 * (Math.pow((-1), (i + 1)) / (2 * i - 1));

            i++;

            if (i % 10000 == 0) System.out.println("PI value for i= " + (i) + ": " + pi);

        } while (i <= 100000);
    }
}





