package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of integers ending with 0;");
        ArrayList<Integer> list = new ArrayList<>(10);
        int element;
        do {
            element = scan.nextInt();
            if (element != 0) {
                list.add(element);
            }
        } while (element != 0);
        System.out.println("Before shuffling:\n" + list);
        shuffle(list);
        System.out.println("After shuffling:\n" + list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = (int) (Math.random() * list.size());
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
