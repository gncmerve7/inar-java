package week_11.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 integers");

        int element;
        do {
            element = scan.nextInt();

            if (element != 0) {
                list.add(element);
            }

        } while (element != 0);

        System.out.println("Before sorting: " + list);

        Collections.sort(list);

        System.out.println("After sorting: " + list);
    }
}
