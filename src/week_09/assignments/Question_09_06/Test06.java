package week_09.assignments.Question_09_06;

import java.util.Arrays;
import java.util.Date;

public class Test06 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        Arrays.sort(createNumbers(100000));
        time.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort :"
                + time.getElapsed() + " milliseconds");

    }

    public static int[] createNumbers(int num) {

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }

}
