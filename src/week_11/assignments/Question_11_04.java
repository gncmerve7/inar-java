package week_11.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers ending with 0:");
        ArrayList<Integer> list = new ArrayList<>();
        int element;
        do {
            element = scan.nextInt();
            if (element != 0) {
                list.add(element);
            }
        } while (element != 0);

        System.out.println(("The largest number in the list is: " + max(list)));
    }

    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
            // System.out.println(list.get(i) + "&" + max);
            //  System.out.println(list.get(0) + "&" + max);

        }
        return max;
    }
}
