package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = createList();
        ArrayList<Integer> list2 = createList();

        System.out.println("The combined list is:" + union(list1, list2));
    }

    public static ArrayList<Integer> createList() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the size of list:");
        int size = scan.nextInt();
        System.out.println("Enter "+ size + " integers for list:");

        int element;
        do {
            element = scan.nextInt();
            list.add(element);
        } while (list.size() < size);

        System.out.println(list);
        return list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }
}
