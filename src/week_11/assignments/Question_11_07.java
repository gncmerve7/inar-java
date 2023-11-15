package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of integers ending with 0;");
        ArrayList<Integer> list = new ArrayList<>();
        do {
            list.add(scan.nextInt());
        } while (scan.nextInt() != 0);

        System.out.println("Before shuffling:\n"+list);
        shuffle(list);
        System.out.println("After shuffling:\n"+list);
    }

    public static void shuffle(ArrayList<Integer> list) {

    }
}
