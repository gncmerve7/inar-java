package week_05.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        System.out.println("Flipping a coin one million times..");

        for (int flipsNum = 0; flipsNum <= 1000000; flipsNum++) {

            double prob = (double) (Math.random());
            if (prob <0.5) {
                head++;
            } else
                tail++;
        }
        System.out.println("Heads: " + head);
        System.out.println("Tails: " + tail);
    }

}
