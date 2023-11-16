package week_11.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        do {
            int element = scan.nextInt();
            list.add(element);
        } while (list.size() != 10);
        System.out.println(list);
        removeDuplicates(list);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    list.remove(list.get(i));
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}