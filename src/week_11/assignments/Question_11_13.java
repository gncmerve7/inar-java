package week_11.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        do {
            int element = scan.nextInt();
            list.add(element);
        } while (list.size() != 10);
        System.out.println(list);
        removeDuplicates(list);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).equals(list.get(i))) {

                list.remove(i + 1);
                i--;

            }
        }
        System.out.println(list);
    }
}
