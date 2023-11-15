package week_11.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        do {
            list.add(scan.nextInt());

        } while (list.size() == 10);
        //removeDuplicates(list);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
