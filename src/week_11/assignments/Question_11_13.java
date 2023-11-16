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
            if (list.get(i+1).equals(list.get(i))) {
                // 1,1,3,3,3,3,4,5,6,6
                // 0 1 2 3 4 5 6 7 8 9 -0
                // 1,3,3,3,3,4,5,6,6
                // 0 1 2 3 4 5 6 7 8 9 -1
                list.remove(i+1);
               // list.set(i-1, list.get(i+1));

            }
        }
        System.out.println(list);
    }
}
